package com.springproject.springbootproject.buyer.service;

import com.springproject.springbootproject.buyer.buyerdto.BuyerDto;
import com.springproject.springbootproject.buyer.entity.Buyer;
import com.springproject.springbootproject.buyer.repository.BuyerRepository;
import com.springproject.springbootproject.buyer.mapper.BuyerDtoToEntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BuyerServiceImpl implements BuyerService {
    private final BuyerRepository buyerRepository;
    private final BuyerDtoToEntityConverter buyerDtoToEntityConverter;

    @Override
    public BuyerDto saveBuyer(BuyerDto buyerDto) {
        Buyer buyer = buyerDtoToEntityConverter.mapToBuyer(buyerDto);
        buyerRepository.save(buyer);
        return buyerDto;
    }

    @Override
    public BuyerDto findByName(String name) {
        Buyer buyer = buyerRepository.findByName(name);
        return buyerDtoToEntityConverter.mapToBuyerDto(buyer);
    }

    @Override
    public BuyerDto updateBuyer(BuyerDto buyerDto) {
       Buyer buyer = buyerDtoToEntityConverter.mapToBuyer(buyerDto);
       buyerRepository.save(buyer);
        return buyerDto;
    }

    @Override
    public void deleteBuyer(Integer id) {
        buyerRepository.deleteById(id);
    }
}
