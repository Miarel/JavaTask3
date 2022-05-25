package com.example.javatask3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DrafterField {
    @Qualifier("supportHero")
    @Autowired
    private Hero hero;

    public String pickHero() {
        return hero.pickHero();
    }
}
