package org.github.boutanche.exo1.domain.entity;

import java.sql.Date;
import java.time.LocalDate;

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
    private LocalDate dateNaissance;
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
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    /**
     * @param dateNaissance
     */
    public void setDateNaissance(LocalDate dateNaissance) {
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
     * @return ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville
     */
    public void setVille(String ville) {

        this.ville = ville;
    }

    /**
     * @return Code postal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * @param codePostal
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

}
