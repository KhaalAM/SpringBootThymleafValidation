package com.inti.SpringBootThymleafValidation.repository;

import com.inti.SpringBootThymleafValidation.model.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>{

}
