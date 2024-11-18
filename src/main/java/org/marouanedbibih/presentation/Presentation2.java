package org.marouanedbibih.presentation;

import org.marouanedbibih.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan(basePackages = { "org.marouanedbibih.dao", "org.marouanedbibih.metier" })
public class Presentation2 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Resultat = " + metier.calcul());
    }
}