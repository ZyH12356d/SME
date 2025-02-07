package com.sme.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column( nullable = false , length = 45)
    private String username;
    @Column( nullable = false , length = 45)
    private String password;
    @Column( nullable = false)
    private Timestamp created_date;
}
