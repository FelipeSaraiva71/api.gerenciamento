package com.api.gerenciamento.utils;

public class UsuarioUtil {

    public static String validaNome(String nome){

        if (nome == null || nome.trim().isBlank() || !nome.matches("[\\p{L} -]+")){
            throw new IllegalArgumentException("Entrada inválida, permitido apenas letras e hífen.");
        }
        return nome;
    }

    public static String validaFormataTelefone(String telefone) {
        if (telefone == null || telefone.isBlank()) {
            throw new IllegalArgumentException("Telefone não pode estar vazio.");
        }

        String limpo = telefone.replaceAll("[^\\d]", "");

        if (!limpo.matches("^\\d{11}$")) {
            throw new IllegalArgumentException("Telefone deve conter 11 dígitos.");
        }

        return limpo.replaceFirst("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
    }

}
