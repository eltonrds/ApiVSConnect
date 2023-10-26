package com.senai.apivsconnect.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioDto(
        @NotBlank String nome,

        @NotBlank @Email(message = "0 email deve estae no formato valido") String email,
        @NotBlank String senha,

        String enderco,

        String cep,

        String tipo_usuario,

        String url_img
) {
}
