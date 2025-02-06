package com.example.presence_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(unique = true, nullable = false)
    //private int numCarte;

    private String nom;
    private String prenom;
    private String tel;
    private String situation;
    private String email;
    private String adresse;
    private String sexe;
    private String image;

    @Column(name = "date_naissance")
    private LocalDate naissance;
}