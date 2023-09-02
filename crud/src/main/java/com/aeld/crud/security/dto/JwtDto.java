package com.aeld.crud.security.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class JwtDto {
    public String token;

    public JwtDto(String token){
        this.token = token;
    }
}
