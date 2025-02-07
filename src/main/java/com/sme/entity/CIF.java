package com.sme.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class CIF {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String nrcNumber;

    @Column(nullable = false)
    private LocalDate dob; // Using LocalDate instead of Date

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String materialStatus;

    @Column(nullable = false)
    private String occupation;

    @Column(nullable = false)
    private Double incomeAmount;

    @Column(nullable = false)
    private Timestamp createdDate;

    @Column(nullable = false)
    private String nrcFrontUrl;

    @Column(nullable = false)
    private String nrcBackUrl;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Current_account acc; // Assuming the naming follows camelCase for consistency
}
