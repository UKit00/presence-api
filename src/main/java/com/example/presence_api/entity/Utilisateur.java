package com.example.presence_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Utilisateur extends Personne {

    @Column(unique = true, nullable = false)
    private String identifiant;

    private String pass;
    private String config;
}
