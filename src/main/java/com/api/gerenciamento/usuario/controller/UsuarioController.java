package com.api.gerenciamento.usuario.controller;


import com.api.gerenciamento.usuario.model.UsuarioModel;
import com.api.gerenciamento.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody UsuarioModel usuarioModel){
        UsuarioModel salvo = usuarioService.salvar(usuarioModel);
        return  ResponseEntity.status(201).body(salvo);
    }


    @GetMapping
    public ResponseEntity<List<UsuarioModel>> listarTodos(){
        return ResponseEntity.ok(usuarioService.lerTodos());
    }

    @PutMapping ("{id}")
    public ResponseEntity<?> atualizarId(@PathVariable Long id, @RequestBody UsuarioModel usuarioModel){
        usuarioModel.setId(id);
        UsuarioModel atualizado = usuarioService.salvar(usuarioModel);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping ("{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        usuarioService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }
}
