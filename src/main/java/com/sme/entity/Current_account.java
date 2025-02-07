package com.sme.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Current_account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String accountNumber;  // Changed to camelCase

    @Column(nullable = false)
    private Double balance;

    @Column(nullable = false)
    private int status;

    @Column(nullable = false)
    private Timestamp createdDate;  // Changed to camelCase
}
