package org.github.boutanche.exo1;

import org.github.boutanche.exo1.configuration.Exo1Configuration;
import org.github.boutanche.exo1.domain.entity.User;
import org.github.boutanche.exo1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    /**
     * @param arg
     */
    public static void main(String[] arg) {

        System.out.println("Hello");

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Exo1Configuration.class);
        for(String beanName : context.getBeanDefinitionNames()){
            System.out.println(beanName);
        }
        var userService = context.getBean(UserService.class);

        User user = new User();
        user.setIdUser(1);
        user.setNameUser("Benoit");

        userService.createUser(user);

    }
}
