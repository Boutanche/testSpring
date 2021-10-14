package org.github.boutanche.exo1.domain.repository.impl;

import org.github.boutanche.exo1.domain.entity.User;
import org.github.boutanche.exo1.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * Accéder à AccountRepository permet de :
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public void addUser(User user){
        //var stmt = @"insert into user (Name) output INSERTED.Id values(@Name)"
        String youhou = "Youhou j'ai créé un User";
        System.out.println(youhou);


    }

}
