package com.api.gerenciamento.servico.controller;


import com.api.gerenciamento.servico.model.ServicoModel;
import com.api.gerenciamento.servico.service.ServicoService;
import org.apache.coyote.Request;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servico")
public class ServicoController {

    @Autowired
    ServicoService servicoService;


    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody ServicoModel servicoModel){
        ServicoModel salvo = servicoService.salvar(servicoModel);
        return ResponseEntity.status(201).body(salvo);
    }

    @GetMapping
    public ResponseEntity<List<ServicoModel>> listarTodos(){
        return ResponseEntity.ok(servicoService.lerTodos());
    }

    @PutMapping
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody ServicoModel servicoModel){
        servicoModel.setId(id);
        ServicoModel atualizado = servicoService.salvar(servicoModel);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        servicoService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }
}
