package com.api.gerenciamento.usuario.DTO;

import com.api.gerenciamento.utils.UsuarioUtil;

public class UsuarioRespostaDTO{

    private String nome;
    private String sobrenome;


    public UsuarioRespostaDTO (String nome, String sobrenome){

        this.nome = UsuarioUtil.validaNome(nome);
        this.sobrenome = UsuarioUtil.validaNome(nome);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = UsuarioUtil.validaNome(nome);
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = UsuarioUtil.validaNome(nome);
    }
}
