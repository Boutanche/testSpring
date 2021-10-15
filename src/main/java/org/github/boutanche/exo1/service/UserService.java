package org.github.boutanche.exo1.service;

import org.github.boutanche.exo1.domain.entity.Utilisateur;

import java.sql.SQLException;

/**
 * Service de gestion des Utillisateurs
 */
public interface UserService {
    /**
     * Création d'un Utilisateur dans la BDD
     * @param utilisateur
     */
    void createUser(Utilisateur utilisateur) throws SQLException;
}
