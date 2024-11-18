package org.marouanedbibih.config;


import org.marouanedbibih.dao.DaoImpl;
import org.marouanedbibih.dao.DaoImpl2;
import org.marouanedbibih.dao.IDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MetierConfig {

    @Bean
    @Profile("dev")
    public IDao daoDev() {
        return new DaoImpl(); // Implémentation pour le développement
    }

    @Bean
    @Profile("prod")
    public IDao daoProd() {
        return new DaoImpl2(); // Implémentation pour la production
    }
}
