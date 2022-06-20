package com.ivorossi.FoldingCalculator.dto;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;


public class JwtResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String token;
    private final Collection<? extends GrantedAuthority> role;

    public JwtResponse(String token, Collection<? extends GrantedAuthority> role) {
        this.token = token;
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public Collection<? extends GrantedAuthority> getRole() {
        return role;
    }
}