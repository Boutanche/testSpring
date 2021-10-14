package org.github.boutanche.exo1.domain.entity;

/**
 * Utilisateur
 */
public class User {


    /**
     * Identifiant Unique de l'utilsateur
     */
    private Integer id;
    /**
     * Nom de l'utilisateur
     */
    private String nom;

    /**
     * Getter nom de l'utilisateur
     * @return nom de l'utilisateur
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter nom
     * @param nom nom de l'utilisateur
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter Id de l'utilisateur
     * @return id de l'utilisateur
     */
    public Integer getId() {
        return id;
    }
    /**
     * Setter Id de l'utilisateur
     * @param id de l'utilisateur
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
