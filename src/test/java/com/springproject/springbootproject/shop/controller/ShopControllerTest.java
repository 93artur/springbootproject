package com.springproject.springbootproject.shop.controller;

import com.springproject.springbootproject.shop.service.ShopDto;
import com.springproject.springbootproject.shop.service.ShopService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class ShopControllerTest {
    private ShopService shopService;
    private ShopController shopController;
    private ShopDto shopDto;

    @BeforeEach
    public void setUp() {
        shopService = mock(ShopService.class);
        shopController = new ShopController(shopService);
        shopDto = new ShopDto(1, "Santa", 111, null);
    }

    @Test
    void findByName() {
        String name = "Max";
        when(shopService.findByName(name)).thenReturn(shopDto);

        shopController.findByName(name);

        verify(shopService).findByName(name);
    }

    @Test
    void saveShop() {
        when(shopService.saveShop(shopDto)).thenReturn(shopDto);

        String result = shopController.saveShop(shopDto);

        Assertions.assertEquals(result, "Shop is saved");
    }

    @Test
    void updateShop() {
        when(shopService.updateShop(shopDto)).thenReturn(shopDto);

        shopController.updateShop(shopDto);

        verify(shopService).updateShop(shopDto);
    }

    @Test
    void deleteShop() {
        int id = 1;
        doNothing().when(shopService).deleteShop(id);

        shopController.deleteShop(String.valueOf(id));

        verify(shopService).deleteShop(id);
    }
}