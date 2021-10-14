package org.github.boutanche.exo1.service;

import org.github.boutanche.exo1.domain.entity.User;
import org.springframework.context.ApplicationContext;

/**
 * Interface de UserServiceImpl
 */
public interface UserService {
    /**
     * Création d'un Utilisateur dans la BDD
     * @param user Un Utilisateur
     */
    void createUser(User user);
}
