package org.github.boutanche.exo1.domain.repository;

import org.github.boutanche.exo1.domain.entity.Utilisateur;

import java.sql.SQLException;

/**
 * Service de gestion des Utilisateurs
 */
public interface UserRepository {
    /**
     * Créer un Utilisateur dans la BDD
     * @param utilisateur Un Utilisateur
     */
    void addUser(Utilisateur utilisateur) throws SQLException;
}
