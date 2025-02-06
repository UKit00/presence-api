package com.example.presence_api.service;

import com.example.presence_api.entity.Personne;
import com.example.presence_api.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneService {
    @Autowired
    private PersonneRepository personneRepository;

    // 1. Ajouter une personne
    public Personne ajouterPersonne(Personne personne) {
        return personneRepository.save(personne);
    }

    // 2. Récupérer toutes les personnes
    public List<Personne> obtenirToutesLesPersonnes() {
        return personneRepository.findAll();
    }

    // 3. Récupérer une personne par ID
    public Optional<Personne> obtenirPersonneParId(Long id) {
        return personneRepository.findById(id);
    }

    // 4. Mettre à jour une personne
    public Personne mettreAJourPersonne(Long id, Personne nouvellePersonne) {
        return personneRepository.findById(id)
                .map(personne -> {
                    personne.setNom(nouvellePersonne.getNom());
                    personne.setPrenom(nouvellePersonne.getPrenom());
                    personne.setTel(nouvellePersonne.getTel());
                    personne.setSituation(nouvellePersonne.getSituation());
                    personne.setEmail(nouvellePersonne.getEmail());
                    personne.setAdresse(nouvellePersonne.getAdresse());
                    personne.setSexe(nouvellePersonne.getSexe());
                    personne.setNaissance(nouvellePersonne.getNaissance());
                    return personneRepository.save(personne);
                }).orElseThrow(() -> new RuntimeException("Personne non trouvée"));
    }

    // 5. Supprimer une personne
    public void supprimerPersonne(Long id) {
        personneRepository.deleteById(id);
    }
}
