package org.github.boutanche;

import org.github.boutanche.applicationcontext.AccountConfig;
import org.github.boutanche.applicationcontext.AccountService;
import org.github.boutanche.perso.MonSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class hello {
    public static void main(String[] arg){
        System.out.println("Hello");

        MonSingleton s1 = MonSingleton.getInstance();
        MonSingleton s2 = MonSingleton.getInstance();

        boolean test = s1==s2;
        System.out.println("s1==s2:"+test);

        ApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        System.out.println(accountService.transformToString());


    }
}
