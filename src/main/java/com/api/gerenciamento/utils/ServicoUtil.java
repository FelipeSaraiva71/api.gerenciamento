package com.api.gerenciamento.utils;

public class ServicoUtil {

    public static String validaServico(String servico){

        if (servico == null || servico.trim().isEmpty() || !servico.matches("[\\p{L} -]+")){
            throw new IllegalArgumentException("Entrada inválida, permitido apenas letras e hífen.");
        }
        return servico;
    }

}
