package org.github.boutanche.exo1.domain.repository.impl;

import org.github.boutanche.exo1.domain.entity.Utilisateur;
import org.github.boutanche.exo1.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;

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

        String name = utilisateur.getNom();
        var request = "insert into exo1.utilisateur (nom) values(?) returning id";

        try(
            Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(request)
        ){
            ps.setObject(1, name, Types.VARCHAR);
            try(
                    ResultSet rs = ps.executeQuery();
            ){
                if(rs.next()){
                    Integer id = rs.getObject(1, Integer.class);
                    System.out.println("INFO : -id de l'utilisateur : " + id);

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
    //TODO : Retourner un utilisateur
    public void findUserById(Integer id){
        var request = "select * from exo1.utilisateur where id = ?";

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
                    System.out.println("INFO : -id de l'utilisateur : " + idRetourne);
                }
            }
        }
        catch (SQLException e){

            throw new RuntimeException("Erreur pendant selection de l'utilisateur", e);
        }
        //return utilisateur;
    }
}
