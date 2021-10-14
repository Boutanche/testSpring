package org.github.boutanche.exo1.service;

import org.github.boutanche.exo1.domain.entity.User;

/**
 * Service de gestion des Utillisateurs
 */
public interface UserService {
    /**
     * Création d'un Utilisateur dans la BDD
     * @param user Un Utilisateur
     */
    void createUser(User user);
}
