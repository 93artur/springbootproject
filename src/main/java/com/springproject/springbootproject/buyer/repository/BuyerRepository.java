package com.springproject.springbootproject.buyer.repository;

import com.springproject.springbootproject.buyer.entity.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
    Buyer findByName(String name);
}
