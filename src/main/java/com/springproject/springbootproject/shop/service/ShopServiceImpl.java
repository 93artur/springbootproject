package com.springproject.springbootproject.shop.service;

import com.springproject.springbootproject.shop.entity.Shop;
import com.springproject.springbootproject.shop.repository.ShopRepository;
import com.springproject.springbootproject.shop.mapper.ShopDtoToEntityConverter;
import com.springproject.springbootproject.shop.shopdto.ShopDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService {
    private final ShopRepository shopRepository;
    private  final ShopDtoToEntityConverter shopDtoToEntityConverter;

    @Override
    public ShopDto saveShop(ShopDto shopDto) {
        Shop shop = shopDtoToEntityConverter.mapToShop(shopDto);
        shopRepository.save(shop);
        return shopDto;
    }

    @Override
    public ShopDto findByName(String name) {
        Shop shop = shopRepository.findByName(name);
        return shopDtoToEntityConverter.mapToShopDto(shop);
    }

    @Override
    public ShopDto updateShop(ShopDto shopDto) {
        Shop shop = shopDtoToEntityConverter.mapToShop(shopDto);
        shopRepository.save(shop);
        return shopDto;
    }

    @Override
    public void deleteShop(Integer id) {
        shopRepository.deleteById(id);
    }
}
