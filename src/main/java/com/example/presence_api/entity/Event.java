package com.example.presence_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeE;

    private String nomE;
    private String organisateur;
    private String etat;

    private LocalDate dateDebut;
    private LocalDate dateFin;
}
