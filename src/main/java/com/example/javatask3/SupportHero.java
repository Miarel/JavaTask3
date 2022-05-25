package com.example.javatask3;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Component
public class SupportHero implements Hero {

    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(SupportHero.class.getName());

    @PostConstruct
    public void init() {
        logger.info("Bean for support initiated");
    }

    @PreDestroy
    public void destroy() {
        logger.info("Bean for support destructured");
    }

    @Override
    public String pickHero() {
        return "Dazzle";
    }
}
