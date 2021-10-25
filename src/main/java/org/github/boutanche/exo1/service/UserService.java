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

    /**
     * Permet de sélection un utilisateur avec son identifiant
     * @param id
     * @return
     * @throws SQLException
     */
    Utilisateur selectUser(Integer id) throws SQLException;

    /**
     * Permet de supprimer un utilisateur en utilisant son identifiant
     * @param id
     * @throws SQLException
     */
    void deleteUser(Integer id) throws SQLException;

    /**
     * Modification de l'utilisateur nécessite de connaitre son Identifiant
     * @param id
     * @param utilisateur
     * @throws SQLException
     */
    void modifyUser(Integer id, Utilisateur utilisateur) throws SQLException;
}

