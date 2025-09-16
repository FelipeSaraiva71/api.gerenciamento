package com.api.gerenciamento.servico.repository;

import com.api.gerenciamento.servico.model.ServicoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<ServicoModel, Long> {
}
