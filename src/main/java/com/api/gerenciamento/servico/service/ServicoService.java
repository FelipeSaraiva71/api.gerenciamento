package com.api.gerenciamento.servico.service;

import com.api.gerenciamento.servico.model.ServicoModel;
import com.api.gerenciamento.servico.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServicoService {

    @Autowired
    ServicoRepository servicoRepository;

    public ServicoModel salvar(ServicoModel servicoModel){
       return servicoRepository.save(servicoModel);
    }

    public List<ServicoModel> lerTodos(){
        return  servicoRepository.findAll();
    }

    public ServicoModel atualizar(ServicoModel servicoModel){
        if (servicoRepository.existsById(servicoModel.getId())){
            return servicoRepository.save(servicoModel);
        }else {
            throw new RuntimeException("Serviço não encontrado para atualização.");
        }
    }

    public void deletarPorId(Long id){
        servicoRepository.deleteById(id);
    }
}
