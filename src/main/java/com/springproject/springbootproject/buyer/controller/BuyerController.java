package com.springproject.springbootproject.buyer.controller;

import com.springproject.springbootproject.buyer.service.BuyerDto;
import com.springproject.springbootproject.buyer.service.BuyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buyer")
@AllArgsConstructor
public class BuyerController {
    private final BuyerService buyerService;

    @GetMapping("/{name}")
    public BuyerDto findByName(@PathVariable("name") String name){
        return buyerService.findByName(name);
    }

    @PostMapping("/save")
    public String saveUser(@RequestBody BuyerDto buyerDto){
        buyerService.saveBuyer(buyerDto);
        return "Buyer is saved";
    }

    @PutMapping("/update")
    public BuyerDto updateUser (@RequestBody BuyerDto buyerDto){
        return buyerService.updateBuyer(buyerDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") String id){
        buyerService.deleteBuyer(Integer.parseInt(id));
    }
}
