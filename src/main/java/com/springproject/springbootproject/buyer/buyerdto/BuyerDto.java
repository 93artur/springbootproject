package com.springproject.springbootproject.buyer.buyerdto;

import com.springproject.springbootproject.buyer.entity.Purchase;
import com.springproject.springbootproject.shop.entity.Shop;
import lombok.Data;
import java.util.List;

@Data
public class BuyerDto {
    private int id;
    private String name;
    private int balance;
    private List<Shop> shops;
    private List<Purchase> purchases;
}
