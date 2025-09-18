package com.api.gerenciamento.usuario.DTO;

import com.api.gerenciamento.utils.UsuarioUtil;

public class UsuarioAtualizacaoDTO{

        private String telefone;

        public UsuarioAtualizacaoDTO(String telefone){

            this.telefone = UsuarioUtil.validaFormataTelefone(telefone);
        }

        public String getTelefone() {
            return this.telefone;
        }
        public void setTelefone(String telefone) {
            this.telefone = UsuarioUtil.validaFormataTelefone(telefone);
        }
    }


