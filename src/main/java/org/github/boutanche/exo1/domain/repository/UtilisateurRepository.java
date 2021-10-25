package org.github.boutanche.exo1.domain.repository;

import org.github.boutanche.exo1.domain.entity.Utilisateur;

import java.sql.SQLException;

/**
 * Repository des Utilisateurs
 */
public interface UtilisateurRepository {
    /**
     * Créer un Utilisateur dans la BDD
     * @param utilisateur Un Utilisateur
     */
    Utilisateur add(Utilisateur utilisateur);

    /**
     * Modifier ltuitilisateur
     * @param utilisateur
     */
    void update(Utilisateur utilisateur);

    /**
     * Sélectionner un utilisateur dont on connait l'id
     * @param id
     * @return
     * @throws SQLException
     */
    Utilisateur findById(Integer id) ;

    /**
     * Supprimer un utilisateur dont on connait l'id
     * @param id
     * @throws SQLException
     */
    void deleteById(Integer id);

}
