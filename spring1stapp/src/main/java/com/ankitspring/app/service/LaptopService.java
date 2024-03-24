package com.ankitspring.app.service;

import com.ankitspring.app.LaptopRepository;
import com.ankitspring.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }
    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
