package com.br.erp.web.service;

import com.br.erp.web.model.User;
import com.br.erp.web.model.dto.CreateUserDTO;
import com.br.erp.web.model.dto.UserDTO;
import com.br.erp.web.repository.UserRepository;
import com.br.erp.web.types.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .toList();
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return modelMapper.map(user, UserDTO.class);
    }

    public UserDTO createUser(CreateUserDTO createUserDTO) {
        if (userRepository.existsByUsername(createUserDTO.getUsername())) {
            throw new RuntimeException("Username already exists");
        }
        User user = modelMapper.map(createUserDTO, User.class);
        if (createUserDTO.getPassword() == null) {
            user.setPassword(null);
        } else {
            user.setPassword(passwordEncoder.encode(createUserDTO.getPassword()));
        }
        Set<Role> rolesSet = new HashSet<>();
        rolesSet.add(Role.EMPLOYEE_ROLE);
        user.setRoles(rolesSet);
        user.setFirstAccess(true);
        user = userRepository.save(user);

        return modelMapper.map(user, UserDTO.class);
    }

    public UserDTO updateUser(Long id, CreateUserDTO updateUserDTO) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        modelMapper.map(updateUserDTO, user);
        user.setPassword(passwordEncoder.encode(updateUserDTO.getPassword()));
        user = userRepository.save(user);

        return modelMapper.map(user, UserDTO.class);
    }

    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found");
        }
        userRepository.deleteById(id);
    }
}
