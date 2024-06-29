package com.springproject.springbootproject.shop.controller;

import com.springproject.springbootproject.shop.shopdto.ShopDto;
import com.springproject.springbootproject.shop.service.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop")
@AllArgsConstructor
public class ShopController {
    private final ShopService shopService;

    @GetMapping("/{name}")
    public ShopDto findByName(@PathVariable("name") String name) {
        return shopService.findByName(name);
    }

    @PostMapping("/save")
    public String saveShop(@RequestBody ShopDto shopDto) {
        shopService.saveShop(shopDto);
        return "Shop is saved";
    }

    @PutMapping("/update")
    public ShopDto updateShop(@RequestBody ShopDto shopDto) {
        return shopService.updateShop(shopDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteShop(@PathVariable("id") String id) {
        shopService.deleteShop(Integer.parseInt(id));
    }
}
