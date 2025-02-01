package com.br.erp.web.controller;

import com.br.erp.web.model.Client;
import com.br.erp.web.model.dto.ClientDTO;
import com.br.erp.web.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<ClientDTO> createClient(@RequestBody ClientDTO client) {
        ClientDTO savedClient = clientService.createClient(client);
        return ResponseEntity.ok(savedClient);
    }

    @GetMapping
    public ResponseEntity<List<ClientDTO>> getAllClients() {
        List<ClientDTO> clients = clientService.getAllClients();
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> getClientById(@PathVariable Long id) {
        return new ResponseEntity<>(this.clientService.getClientById(id), HttpStatusCode.valueOf(200));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClientDTO> updateClient(@PathVariable Long id, @RequestBody ClientDTO client) {
        return new ResponseEntity<>(clientService.updateClient(id, client), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        this.clientService.deleteClient(id);
    }
}
