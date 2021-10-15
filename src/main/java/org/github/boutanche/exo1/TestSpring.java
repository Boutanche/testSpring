package org.github.boutanche.exo1;

import org.github.boutanche.exo1.configuration.Exo1Configuration;
import org.github.boutanche.exo1.domain.entity.Utilisateur;
import org.github.boutanche.exo1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class TestSpring {

    /**
     * CRUD des utilisateurs
     * @param arg is aarg
     */
    public static void main(String[] arg) throws SQLException {

        System.out.println("Hello");

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Exo1Configuration.class);
        for(String beanName : context.getBeanDefinitionNames()){
            System.out.println(beanName);
        }
        var userService = context.getBean(UserService.class);

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("Bernard");
        userService.createUser(utilisateur);

    }
}
