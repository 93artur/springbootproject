package com.springproject.springbootproject.buyer.service;

import com.springproject.springbootproject.buyer.buyerdto.BuyerDto;

public interface BuyerService {

    BuyerDto saveBuyer(BuyerDto buyerDto);

    BuyerDto findByName(String name);

    BuyerDto updateBuyer(BuyerDto buyerDto);

    void deleteBuyer(Integer id);
}
