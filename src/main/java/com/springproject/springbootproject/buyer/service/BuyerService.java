package com.springproject.springbootproject.buyer.service;

public interface BuyerService {

    BuyerDto saveBuyer(BuyerDto buyerDto);

    BuyerDto findByName(String name);

    BuyerDto updateBuyer(BuyerDto buyerDto);

    void deleteBuyer(Integer id);
}
