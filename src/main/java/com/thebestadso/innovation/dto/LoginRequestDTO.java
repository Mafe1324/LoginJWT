package com.thebestadso.innovation.dto;

import lombok.Data;

@Data
public class LoginRequestDTO {
    /**
     * Nombre del usuario
     */
    private String username;

    /**
     * Clave del usuario (texto plano, se compara contra el hash BCrypt)
     */
    private String password;
}
