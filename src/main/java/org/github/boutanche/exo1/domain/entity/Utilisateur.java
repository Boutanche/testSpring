package org.github.boutanche.exo1.domain.entity;

import java.util.Date;

/**
 * Utilisateur
 */
public class Utilisateur {
    /**
     * Identifiant Unique
     */
    private Integer id;
    /**
     * Nom
     */
    private String nom;
    /**
     * Prénom
     */
    private String prenom;
    /**
     * Email
     */
    private String email;
    /**
     * Date de naissance
     */
    private Date dateNaissance;
    /**
     * Pays
     */
    private String pays;
    /**
     * Ville
     */
    private String ville;
    /**
     * Code Postal
     */
    private String codePostal;

    /**
     * @return nom
     */
    public String getNom() {
        return nom;
    }
    /**
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return eamil
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return date de naissance
     */
    public Date getDateNaissance() {
        return dateNaissance;
    }

    /**
     * @param dateNaissance
     */
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * @return pays
     */
    public String getPays() {
        return pays;
    }

    /**
     * @param pays
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
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * @param codePostal Strin Code postal de l'utilisateur
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
}
