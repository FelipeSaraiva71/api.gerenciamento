package com.api.gerenciamento.utils;

public class UsuarioUtil {

    public static String validaNome(String nome){

        if (nome == null || nome.trim().isEmpty() || !nome.matches("[\\p{L} -]+")){
            throw new IllegalArgumentException("Entrada inválida, permitido apenas letras e hífen.");
        }
        return nome;
    }
}
