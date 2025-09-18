package com.api.gerenciamento.usuario.DTO;

import com.api.gerenciamento.utils.UsuarioUtil;

public class UsuarioAtualizacaoDto {

        private String telefone;

        public UsuarioAtualizacaoDto(String telefone){

            this.telefone = UsuarioUtil.validaFormataTelefone(telefone);
        }

        public String getTelefone() {
            return this.telefone;
        }
        public void setTelefone(String telefone) {
            this.telefone = UsuarioUtil.validaFormataTelefone(telefone);
        }
    }


