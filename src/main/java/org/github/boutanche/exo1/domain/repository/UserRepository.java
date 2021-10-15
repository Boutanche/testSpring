package org.github.boutanche.exo1.domain.repository;

import org.github.boutanche.exo1.domain.entity.User;

import java.sql.SQLException;

/**
 * Service de gestion des Utilisateurs
 */
public interface UserRepository {
    /**
     * Créer un Utilisateur dans la BDD
     * @param user Un Utilisateur
     */
    void addUser(User user) throws SQLException;
}
