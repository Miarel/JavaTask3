package com.example.javatask3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DrafterSetter {
    public Hero hero;

    @Autowired
    public void setHero(@Qualifier("carryHero") Hero hero)
    {
        this.hero=hero;
    }

    public String pickHero()
    {
        return hero.pickHero();
    }
}
