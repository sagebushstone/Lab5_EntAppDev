package com.elkabani.firstspringboot.services;

import com.elkabani.firstspringboot.entities.Category;
import com.elkabani.firstspringboot.entities.Product;
import com.elkabani.firstspringboot.repositories.CategoryRepository;
import com.elkabani.firstspringboot.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Transactional
    public void persistRelated()
    {
        /*var cat = Category.builder()
                .name("Electronics")
                .build();
        var prod = Product.builder()
                .name("Camera")
                .build();*/
        var cat = categoryRepository.findById(1).orElseThrow();
        var prod2 = Product.builder()
                .name("Headphones")
                .build();
        //cat.addProduct(prod);
        cat.addProduct(prod2);
        categoryRepository.save(cat);
    }

    public void deleteRelated()
    {
        categoryRepository.deleteById(1);
    }
}
