package com.api.gerenciamento.usuario.service;

import com.api.gerenciamento.usuario.DTO.UsuarioAtualizacaoDto;
import com.api.gerenciamento.usuario.DTO.UsuarioCadastroDto;
import com.api.gerenciamento.usuario.DTO.UsuarioRespostaDto;
import com.api.gerenciamento.usuario.mapper.UsuarioMapper;
import com.api.gerenciamento.usuario.model.UsuarioModel;
import com.api.gerenciamento.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuarioMapper usuarioMapper;

    public void cadastrarUsuario(UsuarioCadastroDto dto) {
        UsuarioModel model = usuarioMapper.toEntity(dto);
        usuarioRepository.save(model);
    }

    public List<UsuarioRespostaDto> lerTodos(){
        List<UsuarioModel> usuarios  = usuarioRepository.findAll();
        return usuarios.stream().map(usuarioMapper::toRespostaDto).toList();
    }

   public void atualizar(Long id, UsuarioAtualizacaoDto dto){
        UsuarioModel usuarioExistente = usuarioRepository.findById(id).orElseThrow(()->
                new RuntimeException("Usuário não encontrado."));
        usuarioMapper.updateEntityFromDto(dto, usuarioExistente);
        usuarioRepository.save(usuarioExistente);
   }

    public void deletarPorId(Long id){
        UsuarioModel usuarioModel = usuarioRepository.findById(id).orElseThrow(()->
                new RuntimeException("Usuário não encontrado."));
        usuarioRepository.deleteById(id);
    }
}
