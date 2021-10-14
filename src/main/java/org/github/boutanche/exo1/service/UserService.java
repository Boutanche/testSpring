package org.github.boutanche.exo1.service;

import org.github.boutanche.exo1.domain.entity.User;
import org.springframework.context.ApplicationContext;

/**
 * Interface de UserServiceImpl
 */
public interface UserService {
    void createUser(User user, ApplicationContext context);
}
