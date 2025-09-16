package com.api.gerenciamento.servico.model;

import com.api.gerenciamento.utils.ServicoUtil;
import jakarta.persistence.*;

@Entity
@Table (name = "serviço")
public class ServicoModel {

    @Id
    @GeneratedValue
            (strategy = GenerationType.IDENTITY)

    private Long id;
    private String nomeServico;
    private String descricao;

    public ServicoModel(){

    }

    public ServicoModel(String nomeServico, String descricao){

        this.nomeServico = ServicoUtil.validaServico(nomeServico);
        this.descricao = ServicoUtil.validaServico(descricao);
    }

    public String getNomeServico(){
        return this.nomeServico;
    }
    public void setNomeServico(String nomeServico){
        this.nomeServico = ServicoUtil.validaServico(nomeServico);
    }
    public String getDescricao(){
        return  this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = ServicoUtil.validaServico(descricao);
    }
}
