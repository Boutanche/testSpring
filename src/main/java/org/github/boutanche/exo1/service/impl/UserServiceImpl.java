package org.github.boutanche.exo1.service.impl;

import org.github.boutanche.exo1.domain.entity.User;
import org.github.boutanche.exo1.domain.repository.UserRepository;
import org.github.boutanche.exo1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Override
    public void createUser(User user, ApplicationContext context) {
        UserRepository repo = context.getBean(UserRepository.class);
        repo.addUser(user);

    }



}
