package org.github.boutanche.exo1.service.impl;

import org.github.boutanche.exo1.domain.entity.User;
import org.github.boutanche.exo1.domain.repository.UserRepository;
import org.github.boutanche.exo1.service.UserService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * Implémentation de l'interface {@link UserService}
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
        try {
            userRepository.addUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
