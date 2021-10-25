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
    void addUtilisateur(Utilisateur utilisateur) throws SQLException;

    /**
     * Sélectionner un utilisateur dont on connait l'id
     * @param id
     * @return
     * @throws SQLException
     */
    Utilisateur findUtilisateurById(Integer id) throws SQLException;

    /**
     * Supprimer un utilisateur dont on connait l'id
     * @param id
     * @throws SQLException
     */
    void deleteUtilisateurById(Integer id) throws  SQLException;

    /**
     * Mise à jour d'un utilisateur
     * @param id
     * @param utlisateur
     */
    void updateUtilisateurById(Integer id, Utilisateur utlisateur);
}
