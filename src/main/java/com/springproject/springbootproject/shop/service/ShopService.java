package com.springproject.springbootproject.shop.service;

public interface ShopService {
    ShopDto saveShop(ShopDto shopDto);

    ShopDto findByName(String name);

    ShopDto updateShop(ShopDto shopDto);

    void deleteShop(Integer id);
}
