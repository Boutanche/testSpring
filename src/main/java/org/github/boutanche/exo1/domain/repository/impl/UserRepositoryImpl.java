package org.github.boutanche.exo1.domain.repository.impl;

import org.github.boutanche.exo1.domain.entity.Utilisateur;
import org.github.boutanche.exo1.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;

/**
 * Implémentation de l'interface {@link UserRepository}
 */
@Repository
public class UserRepositoryImpl implements UserRepository {


    private final DataSource dataSource;

    public UserRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * créer un Utilisateur dans la BDD.
     * @param utilisateur
     */
    @Override
    public void addUser(Utilisateur utilisateur) throws SQLException {

        String nom = utilisateur.getNom();
        String prenom = utilisateur.getPrenom();
        String email = utilisateur.getEmail();
        LocalDate dateNaissance = utilisateur.getDateNaissance();
        String pays = utilisateur.getPays();
        String ville = utilisateur.getVille();
        String codePostal = utilisateur.getCodePostal();

        var request = "insert into exo1.utilisateur (nom, prenom, email, date_naissance, pays, ville, code_postal) values(?, ?, ?, ?, ? , ?, ? ) returning id";

        try(
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement(request)
        ) {
            ps.setObject(1, nom, Types.VARCHAR);
            ps.setObject(2, prenom, Types.VARCHAR);
            ps.setObject(3, email, Types.VARCHAR);
            ps.setObject(4, dateNaissance,Types.DATE);
            ps.setObject(5, pays, Types.VARCHAR);
            ps.setObject(6, ville, Types.VARCHAR);
            ps.setObject(7, codePostal, Types.VARCHAR);

            try(
                    ResultSet rs = ps.executeQuery();
            ){
                if(rs.next()){
                    Integer id = rs.getObject(1, Integer.class);
                    ;
                    System.out.println("INFO : -id de l'utilisateur : " + findUserById(id).toString());

                }
            }
        }
        catch (SQLException e){

            throw new RuntimeException("Erreur pendant l'insert user", e);
        }
    }

    /**
     * retrouver un Utilisateur par son identifiant unique
     * @param id
     * @return Utilisateur
     */

    public Utilisateur findUserById(Integer id){
        var request = "select * from exo1.utilisateur where id = ?";
        Utilisateur utilisateur = new Utilisateur();

        try(
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement(request)
        ){
            ps.setObject(1, id, Types.INTEGER);
            try(
                    ResultSet rs = ps.executeQuery();
            ){
                if(rs.next()){
                    Integer idRetourne = rs.getObject(1, Integer.class);
                    String nomRetourne = rs.getObject(2, String.class);
                    String prenomRetourne = rs.getObject(3, String.class);
                    String emailRetourne = rs.getObject(4, String.class);
                    LocalDate dateNaissanceRetourne = rs.getObject(5, LocalDate.class);
                    String paysRetourne = rs.getObject(6, String.class);
                    String villeRetourne = rs.getObject(7, String.class);
                    String codePostalRetourne = rs.getObject(8, String.class);

                    utilisateur.setId(idRetourne);
                    utilisateur.setNom(nomRetourne);
                    utilisateur.setPrenom(prenomRetourne);
                    utilisateur.setEmail(emailRetourne);
                    utilisateur.setDateNaissance(dateNaissanceRetourne);
                    utilisateur.setPays(paysRetourne);
                    utilisateur.setVille(villeRetourne);
                    utilisateur.setCodePostal(codePostalRetourne);
                }
            }
        }
        catch (SQLException e){

            throw new RuntimeException("Erreur pendant selection de l'utilisateur", e);
        }
        return utilisateur;
    }
}
