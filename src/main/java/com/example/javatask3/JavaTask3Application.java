package com.example.javatask3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaTask3Application {

    private static Drafter constructorInjection;
    private static DrafterField fieldInjection;
    private static DrafterSetter setterInjection;

    public JavaTask3Application(Drafter constructorInjection, DrafterField fieldInjection, DrafterSetter setterInjection) {
        JavaTask3Application.constructorInjection = constructorInjection;
        JavaTask3Application.fieldInjection = fieldInjection;
        JavaTask3Application.setterInjection = setterInjection;
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaTask3Application.class, args);
        System.out.println(constructorInjection.pickHero());
        System.out.println(fieldInjection.pickHero());
        System.out.println(setterInjection.pickHero());
    }

}
