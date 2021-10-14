package org.github.boutanche.exo1.service;

import org.github.boutanche.exo1.domain.entity.User;

/**
 * Interface de UserServiceImpl
 */
public interface UserService {
    default void createUser(User user){

    }
}
