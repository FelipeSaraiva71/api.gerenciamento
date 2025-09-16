package com.api.gerenciamento.usuario.service;

import com.api.gerenciamento.usuario.model.UsuarioModel;
import com.api.gerenciamento.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioModel salvar(UsuarioModel usuarioModel){
        return usuarioRepository.save(usuarioModel);
    }

    public List<UsuarioModel> lerTodos(){
        return usuarioRepository.findAll();
    }

    public UsuarioModel atualizar(UsuarioModel usuarioModel){
        if (usuarioRepository.existsById(usuarioModel.getId())){
            return usuarioRepository.save(usuarioModel);
        }else {
            throw new RuntimeException("Usúario não encontrado para atualização.");
        }
    }

    public void deletarPorId(Long id){
        usuarioRepository.deleteById(id);
    }
}
