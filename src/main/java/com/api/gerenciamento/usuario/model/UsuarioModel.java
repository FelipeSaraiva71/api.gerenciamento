package com.api.gerenciamento.usuario.model;

import com.api.gerenciamento.utils.UsuarioUtil;
import jakarta.persistence.*;
import jdk.jshell.execution.Util;

@Entity
@Table (name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue
            (strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String sobrenome;

    public UsuarioModel (){

    }
    public UsuarioModel (String nome, String sobrenome){

      this.nome = UsuarioUtil.validaNome(nome);
      this.sobrenome = UsuarioUtil.validaNome(sobrenome);
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = UsuarioUtil.validaNome(nome);
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = UsuarioUtil.validaNome(sobrenome);
    }
}
