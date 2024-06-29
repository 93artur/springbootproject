package com.springproject.springbootproject.shop.service;

import com.springproject.springbootproject.shop.entity.Shop;
import com.springproject.springbootproject.shop.repository.ShopRepository;
import com.springproject.springbootproject.shop.mapper.ShopDtoToEntityConverter;
import com.springproject.springbootproject.shop.shopdto.ShopDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class ShopServiceImplTest {
    private ShopRepository shopRepository;
    private ShopDtoToEntityConverter shopDtoToEntityConverter;
    private ShopDto shopDto;
    private Shop shop;
    private ShopServiceImpl shopService;

    @BeforeEach
    public void setUp() {
        shopRepository = mock(ShopRepository.class);
        shopDtoToEntityConverter = mock(ShopDtoToEntityConverter.class);
        shop = new Shop(1, "Santa", 111, null);
        shopDto = new ShopDto(1, "Santa", 111, null);
        shopService = new ShopServiceImpl(shopRepository, shopDtoToEntityConverter);
    }

    @Test
    void saveShop() {
        when(shopDtoToEntityConverter.mapToShop(shopDto)).thenReturn(shop);
        when(shopRepository.save(shop)).thenReturn(shop);

        shopService.saveShop(shopDto);

        verify(shopRepository).save(shop);
    }

    @Test
    void findByName() {
        String name = "Santa";
        when(shopRepository.findByName(name)).thenReturn(shop);
        when((shopDtoToEntityConverter.mapToShopDto(shop))).thenReturn(shopDto);

        shopService.findByName(name);

        verify(shopRepository).findByName(name);
    }

    @Test
    void updateShop() {
        when(shopDtoToEntityConverter.mapToShop(shopDto)).thenReturn(shop);
        when(shopRepository.save(shop)).thenReturn(shop);

        shopService.updateShop(shopDto);

        verify(shopRepository).save(shop);
    }

    @Test
    void deleteShop() {
        int id = 1;
        doNothing().when(shopRepository).deleteById(id);

        shopService.deleteShop(id);

        verify(shopRepository).deleteById(id);
    }
}