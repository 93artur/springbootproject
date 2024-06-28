package com.springproject.springbootproject.shop.service;

import com.springproject.springbootproject.buyer.entity.Buyer;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class ShopDto {
    private int id;
    private String name;
    private int contactNumber;
    private List<Buyer> buyerList;
}
