package org.github.boutanche;

import org.github.boutanche.applicationcontext.AccountConfig;
import org.github.boutanche.applicationcontext.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testSpring {
    public static void main(String[] arg) {
        System.out.println("Hello");
        ApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        System.out.println(accountService.transformToString());
    }
}
