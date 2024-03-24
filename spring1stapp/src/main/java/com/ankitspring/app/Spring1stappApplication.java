package com.ankitspring.app;

import com.ankitspring.app.model.Alien;
import com.ankitspring.app.model.Laptop;
import com.ankitspring.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring1stappApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(Spring1stappApplication.class, args);
		System.out.println("hy");
//		Alien obj=context.getBean(Alien.class);
//		obj.code();
//		System.out.println(obj.getAge());

		LaptopService service =context.getBean(LaptopService.class);
		Laptop lap= context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}
