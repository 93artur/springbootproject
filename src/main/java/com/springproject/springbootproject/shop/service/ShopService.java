package com.springproject.springbootproject.shop.service;

import com.springproject.springbootproject.shop.shopdto.ShopDto;

public interface ShopService {
    ShopDto saveShop(ShopDto shopDto);

    ShopDto findByName(String name);

    ShopDto updateShop(ShopDto shopDto);

    void deleteShop(Integer id);
}
