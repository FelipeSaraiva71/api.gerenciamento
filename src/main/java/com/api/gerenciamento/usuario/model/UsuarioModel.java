package com.api.gerenciamento.usuario.model;

import com.api.gerenciamento.utils.UsuarioUtil;
import jakarta.persistence.*;

@Entity
@Table (name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue
            (strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String sobrenome;
    private String telefone;

    public UsuarioModel (){

    }
    public UsuarioModel (String nome, String sobrenome, String telefone){

      this.nome = nome;
      this.sobrenome = sobrenome;
      this.telefone = telefone;
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
        this.nome = nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
