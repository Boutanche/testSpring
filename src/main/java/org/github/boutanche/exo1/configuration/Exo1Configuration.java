package org.github.boutanche.exo1.configuration;

import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.*;

/**
 * Configuration pour Exo1
 */
@Configuration
@ComponentScan(basePackages = {"org.github.boutanche.exo1"})
public class Exo1Configuration {
//créer un bean qui pointe vers la BDD java.sql.datasource

    /**
     * Connection à la BDD PostgreSql
     * @return
     */
    @Bean
    public PGSimpleDataSource dataSource(){
        String db = SecretConnection.db;
        String user = SecretConnection.user;
        String mp = SecretConnection.mp;

        PGSimpleDataSource ds = new PGSimpleDataSource() ;
        ds.setURL("jdbc:postgresql://localhost:5432/");
        ds.setDatabaseName( db );
        ds.setUser( user );
        ds.setPassword( mp );

        return ds;
    }
}
