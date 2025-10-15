package com.elkabani.firstspringboot;

import com.elkabani.firstspringboot.entities.Address;
import com.elkabani.firstspringboot.entities.Category;
import com.elkabani.firstspringboot.entities.Product;
import com.elkabani.firstspringboot.entities.User;
import com.elkabani.firstspringboot.repositories.CategoryRepository;
import com.elkabani.firstspringboot.repositories.ProductRepository;
import com.elkabani.firstspringboot.repositories.UserRepository;
import com.elkabani.firstspringboot.services.CategoryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

    public static void main(String[] args)
    {
        ApplicationContext context =  SpringApplication.run(FirstSpringBootApplication.class, args);

        var categoryService = context.getBean(CategoryService.class);
        //categoryService.persistRelated();

        var prodRepository = context.getBean(ProductRepository.class);
        prodRepository.deleteById(2);

    }

}
