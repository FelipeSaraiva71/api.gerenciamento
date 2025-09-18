package com.api.gerenciamento.usuario.controller;


import com.api.gerenciamento.usuario.DTO.UsuarioAtualizacaoDto;
import com.api.gerenciamento.usuario.DTO.UsuarioCadastroDto;
import com.api.gerenciamento.usuario.DTO.UsuarioRespostaDto;
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
    public ResponseEntity<UsuarioCadastroDto> cadastrar(@RequestBody UsuarioCadastroDto dto){
       usuarioService.cadastrarUsuario(dto);
        return  ResponseEntity.status(201).body(dto);
    }


    @GetMapping
    public ResponseEntity<List<UsuarioRespostaDto>> listarTodos(){
        return ResponseEntity.ok(usuarioService.lerTodos());
    }

    @PutMapping ("{id}")
    public ResponseEntity<UsuarioAtualizacaoDto> atualizarId(@PathVariable Long id, @RequestBody UsuarioAtualizacaoDto usuarioAtualizacaoDto){
        usuarioService.atualizar(id , usuarioAtualizacaoDto);
        return ResponseEntity.ok().body(usuarioAtualizacaoDto);
    }

    @DeleteMapping ("{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        usuarioService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }
}
