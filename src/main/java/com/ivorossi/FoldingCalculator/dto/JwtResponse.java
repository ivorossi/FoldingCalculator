package com.ivorossi.FoldingCalculator.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;



public class JwtResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String token;

    public JwtResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}