package com.ankitspring.app.repo;

import com.ankitspring.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("saved in Database...");
    }
}
