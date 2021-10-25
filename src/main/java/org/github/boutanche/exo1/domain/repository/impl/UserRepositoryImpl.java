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
    public void addUtilisateur(Utilisateur utilisateur) throws SQLException {

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
                    System.out.println("INFO : -id de l'utilisateur : " + findUtilisateurById(id).toString());

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
    @Override
    public Utilisateur findUtilisateurById(Integer id){
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


    /**
     * Supprimer un utilisateur par son identifiant
     * @param id
     */
    @Override
    public void deleteUtilisateurById(Integer id){
        String request ="DELETE FROM exo1.utilisateur WHERE id= ?";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement statement = conn.prepareStatement(request);
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Suppression effectuée avec une action sur " + 1 + " ligne.");
        }

        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Override
    public void updateUtilisateurById(Integer id, Utilisateur utilisateur){
        String request ="UPDATE exo1.utilisateur set nom = ?, prenom = ?, email = ?, " +
                "date_naissance = ?, pays = ?, ville = ?, code_postal = ? WHERE id = ?";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement statement = conn.prepareStatement(request);
            if(id == utilisateur.getId()){
                statement.setObject(1, utilisateur.getNom());
                statement.setObject(2, utilisateur.getPrenom());
                statement.setObject(3, utilisateur.getEmail());
                statement.setObject(4, utilisateur.getDateNaissance());
                statement.setObject(5, utilisateur.getPays());
                statement.setObject(6, utilisateur.getVille());
                statement.setObject(7, utilisateur.getCodePostal());
                statement.setObject(8, id);
                statement.executeUpdate();
            }
            else{
                System.out.println("Vous essayez de modifier le mauvais utilisateur");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
