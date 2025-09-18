package com.api.gerenciamento.usuario.mapper;
import com.api.gerenciamento.usuario.DTO.UsuarioAtualizacaoDTO;
import com.api.gerenciamento.usuario.DTO.UsuarioCadastroDTO;
import com.api.gerenciamento.usuario.DTO.UsuarioRespostaDTO;
import com.api.gerenciamento.usuario.model.UsuarioModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper (componentModel = "spring")
public interface UsuarioMapper {


    UsuarioModel toEntity(UsuarioCadastroDTO dto);

    UsuarioRespostaDTO toRespostaDTO(UsuarioModel model);

    void updateEntityFromDTO(UsuarioAtualizacaoDTO dto,@MappingTarget UsuarioModel entity);
}
