package com.api.gerenciamento.usuario.repository;

import com.api.gerenciamento.usuario.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}
