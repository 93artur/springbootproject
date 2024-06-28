package com.springproject.springbootproject.shop.entity;

import com.springproject.springbootproject.buyer.entity.Buyer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "shops")
@AllArgsConstructor
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int contactNumber;

    @ManyToMany(mappedBy = "shopList")
    private List<Buyer> buyerList;
}
