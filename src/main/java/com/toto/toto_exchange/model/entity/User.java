package com.toto.toto_exchange.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Enumerated
    private UserAuth authority;

    public void setPassword(String pw){
        //TODO Encrypt
        this.password=pw;
    }
}
