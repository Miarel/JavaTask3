package com.example.javatask3;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.logging.Logger;

@Component(value = "carryHero")
public class CarryHero implements Hero {

    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(CarryHero.class.getName());

    @PostConstruct
    public void init() {
        logger.info("Bean for carry initiated");
    }

    @PreDestroy
    public void destroy() {
        logger.info("Bean for carry destructured");
    }

    @Override
    public String pickHero() {
        return "Drow Ranger";
    }
}
