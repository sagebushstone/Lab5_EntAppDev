package com.elkabani.firstspringboot;

import com.elkabani.firstspringboot.entities.Address;
import com.elkabani.firstspringboot.entities.Category;
import com.elkabani.firstspringboot.entities.Product;
import com.elkabani.firstspringboot.entities.User;
import com.elkabani.firstspringboot.repositories.CategoryRepository;
import com.elkabani.firstspringboot.repositories.ProductRepository;
import com.elkabani.firstspringboot.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

    public static void main(String[] args)
    {
        ApplicationContext context =  SpringApplication.run(FirstSpringBootApplication.class, args);

        var categoryRepository = context.getBean(CategoryRepository.class);
        var productRepository = context.getBean(ProductRepository.class);

        var catElectronics= Category.builder().name("Electronics").build();
        var prod = Product.builder().name("Camera").price(53.25).category(catElectronics).build();
//        categoryRepository.save(catElectronics);
//        productRepository.save(prod);

        var category = categoryRepository.findById(2).orElseThrow();
        var prod2 = Product.builder().name("Headphones").price(26.75).category(category).build();
//        productRepository.save(prod2);

        productRepository.deleteById(4); //deleting headphones

    }

}
