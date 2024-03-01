package com.example.shoponline.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "about")
    private String about;

    @Column(name = "available")
    private Integer available;

    @Column(name = "createdate")
    private Date createdate;

    @Column(name = "discount")
    private Integer discount;

    @Column(name = "image")
    private String image;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private float price;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name = "categoryid",referencedColumnName = "id")
    private Category category;

}
