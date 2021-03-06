package org.github.boutanche.exo1;

import org.github.boutanche.exo1.configuration.Exo1Configuration;
import org.github.boutanche.exo1.domain.entity.Utilisateur;
import org.github.boutanche.exo1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;


public class TestSpring {

    /**
     * CRUD des utilisateurs
     * @param arg is aarg
     */
    public static void main(String[] arg) throws SQLException, ParseException {

        System.out.println("Hello");

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Exo1Configuration.class);
        for(String beanName : context.getBeanDefinitionNames()){
            System.out.println(beanName);
        }
        var userService = context.getBean(UserService.class);

        //Create :
        Utilisateur utilisateur = new Utilisateur();
        Utilisateur controle = new Utilisateur();

        utilisateur.setNom("BAYLE");
        utilisateur.setPrenom("Fabrice");
        utilisateur.setEmail("FB@gmalo.com");
        utilisateur.setDateNaissance(LocalDate.of(1995,12,10));
        utilisateur.setPays("France");
        utilisateur.setVille("Limoges");
        utilisateur.setCodePostal("87000");


        controle = userService.create(utilisateur);
        System.out.println(controle.getId());
        System.out.println(controle.getPrenom());

        //Update
        controle.setPrenom("Pierre");
        userService.update(controle);

        //FindById
        userService.select(19);

        //Delete
        userService.delete(18);
    }
}
