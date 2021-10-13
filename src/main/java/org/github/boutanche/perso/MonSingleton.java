package org.github.boutanche.perso;

public class MonSingleton {
    private static MonSingleton UNIQUE = null;
    private MonSingleton(){

    }
    public static synchronized MonSingleton getInstance(){
        if (UNIQUE == null){
            UNIQUE = new MonSingleton();
        }
        return UNIQUE;
    }
}
