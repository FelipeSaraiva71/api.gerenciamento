package com.api.gerenciamento.usuario.DTO;

import com.api.gerenciamento.utils.UsuarioUtil;

public class UsuarioCadastroDTO {

    private String nome;
    private String sobrenome;
    private String telefone;

    public UsuarioCadastroDTO(String nome, String sobrenome, String telefone){

        this.nome = UsuarioUtil.validaNome(nome);
        this.sobrenome = UsuarioUtil.validaNome(nome);
        this.telefone = UsuarioUtil.validaFormataTelefone(telefone);
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
    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = UsuarioUtil.validaFormataTelefone(telefone);
    }
}
