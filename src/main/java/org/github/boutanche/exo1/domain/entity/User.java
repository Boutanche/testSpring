package org.github.boutanche.exo1.domain.entity;

/**
 * Utilisateur
 */
public class User {

    /**
     * Identifiant Unique de l'Utilsateur
     */
    private int id;
    /**
     * Nom de l'utilisateur
     */
    private String name;

    public void setIdUser(int idUser){
        this.id = idUser;
    }
    public int getIdUser(){
        return id;
    }
    public void setNameUser(String nameUser){
        this.name = nameUser;
    }
    public String getNameUser(){
        return name;
    }
}
