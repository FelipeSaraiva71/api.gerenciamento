package com.api.gerenciamento.usuario.mapper;
import com.api.gerenciamento.usuario.DTO.UsuarioAtualizacaoDto;
import com.api.gerenciamento.usuario.DTO.UsuarioCadastroDto;
import com.api.gerenciamento.usuario.DTO.UsuarioRespostaDto;
import com.api.gerenciamento.usuario.model.UsuarioModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper (componentModel = "spring")
public interface UsuarioMapper {


    UsuarioModel toEntity(UsuarioCadastroDto dto);

    UsuarioRespostaDto toRespostaDto(UsuarioModel model);

    void updateEntityFromDto(UsuarioAtualizacaoDto dto, @MappingTarget UsuarioModel entity);


}
