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
    Utilisateur create(Utilisateur utilisateur);

    /**
     * Modification et mise à jour de l'utilisateur
     * @param utilisateur
     * @throws SQLException
     */
    void update(Utilisateur utilisateur);

    /**
     * Permet de sélection un utilisateur avec son identifiant
     * @param id
     * @return
     * @throws SQLException
     */
    Utilisateur select(Integer id);

    /**
     * Permet de supprimer un utilisateur en utilisant son identifiant
     * @param id
     * @throws SQLException
     */
    void delete(Integer id);

}

