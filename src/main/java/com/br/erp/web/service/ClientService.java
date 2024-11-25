package com.br.erp.web.service;

import com.br.erp.web.exceptions.ResourceNotFoundException;
import com.br.erp.web.model.Client;
import com.br.erp.web.model.dto.ClientDTO;
import com.br.erp.web.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ClientDTO createClient(ClientDTO clientDTO) {
        Client client = modelMapper.map(clientDTO, Client.class);
        Client savedClient = clientRepository.save(client);
        return modelMapper.map(savedClient, ClientDTO.class);
    }

    public List<ClientDTO> getAllClients() {
        return clientRepository.findAll().stream()
                .map(client -> modelMapper.map(client, ClientDTO.class))
                .collect(Collectors.toList());
    }

    public ClientDTO getClientById(Long id) {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Client not found with ID: " + id));
        return modelMapper.map(client, ClientDTO.class);
    }

    public ClientDTO updateClient(Long id, ClientDTO clientDTO) {
        Client existingClient = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Client not found with ID: " + id));

        modelMapper.map(clientDTO, existingClient);
        Client updatedClient = clientRepository.save(existingClient);
        return modelMapper.map(updatedClient, ClientDTO.class);
    }

    public void deleteClient(Long id) {
        if (!clientRepository.existsById(id)) {
            throw new ResourceNotFoundException("Client not found with ID: " + id);
        }
        clientRepository.deleteById(id);
    }
}
