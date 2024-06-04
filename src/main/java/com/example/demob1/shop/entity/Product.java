package com.example.demob1.shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Float price;

    @Column(name="Createdate")
    private LocalDate createDate;

    @ManyToOne
    @JoinColumn(name = "Catetoryid",referencedColumnName = "id")
    private Catetory catetory;
}
