package com.aeld.crud.security.dto;

import com.aeld.crud.security.entity.Usuario;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class JwtDto {
    public String token;
    public Usuario usuario;

    public JwtDto(String token){
        this.token = token;
    }

    public JwtDto(String token, Usuario usuario){
        this.token = token;
        this.usuario = usuario;
    }
}
