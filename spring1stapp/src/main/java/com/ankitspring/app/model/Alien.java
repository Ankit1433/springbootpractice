package com.ankitspring.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private Computer comp;
    @Value("23")
    private int age;
    public void code(){comp.compile();
    }

    public Computer getComp() {
        return comp;
    }
    @Autowired
    @Qualifier("desktop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
