package com.springproject.springbootproject.shop.service;

import com.springproject.springbootproject.shop.entity.Shop;
import com.springproject.springbootproject.shop.repository.ShopRepository;
import com.springproject.springbootproject.shop.service.mapper.ShopDtoEntityAdapter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class ShopServiceImplTest {
    private ShopRepository shopRepository;
    private ShopDtoEntityAdapter shopDtoEntityAdapter;
    private ShopDto shopDto;
    private Shop shop;
    private ShopServiceImpl shopService;

    @BeforeEach
    public void setUp() {
        shopRepository = mock(ShopRepository.class);
        shopDtoEntityAdapter = mock(ShopDtoEntityAdapter.class);
        shop = new Shop(1, "Santa", 111, null);
        shopDto = new ShopDto(1, "Santa", 111, null);
        shopService = new ShopServiceImpl(shopRepository, shopDtoEntityAdapter);
    }

    @Test
    void saveShop() {
        when(shopDtoEntityAdapter.mapToShop(shopDto)).thenReturn(shop);
        when(shopRepository.save(shop)).thenReturn(shop);

        shopService.saveShop(shopDto);

        verify(shopRepository).save(shop);
    }

    @Test
    void findByName() {
        String name = "Santa";
        when(shopRepository.findByName(name)).thenReturn(shop);
        when((shopDtoEntityAdapter.mapToShopDto(shop))).thenReturn(shopDto);

        shopService.findByName(name);

        verify(shopRepository).findByName(name);
    }

    @Test
    void updateShop() {
        when(shopDtoEntityAdapter.mapToShop(shopDto)).thenReturn(shop);
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