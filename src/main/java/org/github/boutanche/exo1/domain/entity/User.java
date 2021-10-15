package org.github.boutanche.exo1.domain.entity;

import java.util.Date;

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
     * Prénom de l'utilisateur
     */
    private String prenom;
    /**
     * Email de l'utilisateur
     */
    private String email;
    /**
     * Date de naissance de l'utilisateur
     */
    private Date date_naissance;
    /**
     * Pays de l'utilisateur
     */
    private String pays;
    /**
     * Ville de l'utilisateur
     */
    private String ville;
    /**
     * Code Postal de l'utilisateur
     */
    private String code_postal;

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

    /**
     * @return Getter de prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom String prenom de l'utilisateur
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return Getter Email de l'utilisateur
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email String email de l'utilisateur
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Date date de naissande de l'utilisateur
     */
    public Date getDate_naissance() {
        return date_naissance;
    }

    /**
     * @param date_naissance Date date de naissance de l'utilisateur
     */
    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    /**
     * @return Getter du pays de l'utilisateur
     */
    public String getPays() {
        return pays;
    }

    /**
     * @param pays String pays de l'utilisateur
     */
    public void setPays(String pays) {
        this.pays = pays;
    }

    /**
     * @return Getter ville de l'utilisateur
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville Sting ville de l'utilisateur
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return Getter du code postal de l'utilisateur
     */
    public String getCode_postal() {
        return code_postal;
    }

    /**
     * @param code_postal Strin Code postal de l'utilisateur
     */
    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }
}
