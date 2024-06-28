package com.springproject.springbootproject.shop.repository;

import com.springproject.springbootproject.shop.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, Integer> {
    Shop findByName(String name);
}
