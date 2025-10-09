package com.elkabani.firstspringboot.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="products")
@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="price", nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn(name="category_id")
    @ToString.Exclude
    private Category category;

}
