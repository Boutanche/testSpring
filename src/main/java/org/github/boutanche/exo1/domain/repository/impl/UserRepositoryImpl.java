package org.github.boutanche.exo1.domain.repository.impl;

import org.github.boutanche.exo1.configuration.Exo1Configuration;
import org.github.boutanche.exo1.domain.entity.User;
import org.github.boutanche.exo1.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.Locale;

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
     * @param user un Utilisateur
     */
    @Override
    public void addUser(User user) throws SQLException {

        String name = user.getNom();

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
            System.out.println("Erreur dans l'ajout d'un utilisateur " + e);
        }

    }

}
