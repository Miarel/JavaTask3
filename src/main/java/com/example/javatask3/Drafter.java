package com.example.javatask3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Drafter {
    private Hero hero;

    public Drafter(@Qualifier("carryHero") Hero hero) {
        this.hero=hero;
    }

    public String pickHero() {
        return hero.pickHero();
    }
}

