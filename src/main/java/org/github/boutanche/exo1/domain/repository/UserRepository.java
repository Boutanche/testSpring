package org.github.boutanche.exo1.domain.repository;

import org.github.boutanche.exo1.domain.entity.User;
import org.github.boutanche.exo1.domain.repository.impl.UserRepositoryImpl;

/**
 * Interface de UserRepositoryImpl
 */
public interface UserRepository {

    static void addUser(User user) {
        UserRepositoryImpl _user = new UserRepositoryImpl();
        _user.addUser(user);
    }
}
