package com.example.javatask3;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Component
public class SupportHero implements Hero {
    private static final Logger log = Logger.getLogger(CarryHero.class.getName());

    @PostConstruct
    public void init() {
        log.info("Bean for support initiated");
    }

    @PreDestroy
    public void destroy() {
        log.info("Bean for support destructured");
    }

    @Override
    public String pickHero() {
        return "Dazzle";
    }
}
