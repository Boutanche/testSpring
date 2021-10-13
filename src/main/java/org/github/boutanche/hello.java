package org.github.boutanche;

import org.github.boutanche.perso.MonSingleton;

public class hello {
    public static void main(String[] arg){
        System.out.println("Hello");

        MonSingleton s1 = MonSingleton.getInstance();
        MonSingleton s2 = MonSingleton.getInstance();

        boolean test = s1==s2;
        System.out.println("s1==s2:"+test);


    }
}
