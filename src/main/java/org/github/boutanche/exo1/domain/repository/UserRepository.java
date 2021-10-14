package org.github.boutanche.exo1.domain.repository;

import org.github.boutanche.exo1.domain.entity.User;

/**
 * Interface de UserRepositoryImpl
 */
public interface UserRepository {
    default void addUser(User user) {

    }
}
