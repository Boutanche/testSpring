package org.github.boutanche.exo1.domain.repository.impl;

import org.github.boutanche.exo1.domain.entity.User;
import org.github.boutanche.exo1.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * Hyper important
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    //injecter dans le constructer la datasource

    /**
     * créer un Utilisateur dans la BDD.
     * @param user un Utilisateur
     */

    @Override
    public void addUser(User user){

        //var stmt = @"insert into user (Name) output INSERTED.Id values(@Name)"

        //return User

        String youhou = "Youhou j'ai créé un User";
        System.out.println(youhou);
    }

}
