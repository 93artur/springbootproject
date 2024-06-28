package com.springproject.springbootproject.buyer.entity;

import com.springproject.springbootproject.shop.entity.Shop;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "buyers")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int balance;

    @ManyToMany
    @JoinTable(name = "buyer_shop",
    joinColumns = @JoinColumn(name = "buyer_id"),
    inverseJoinColumns = @JoinColumn(name = "shop_id"))
    private List<Shop> shopList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "buyer_id", referencedColumnName = "id")
    private List<Purchase> purchaseList;
}
