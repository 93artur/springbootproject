package com.springproject.springbootproject.shop.mapper;

import com.springproject.springbootproject.shop.entity.Shop;
import com.springproject.springbootproject.shop.shopdto.ShopDto;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Component;

@Component
public class ShopDtoToEntityConverter {
    private final ConversionService conversionService;

    public ShopDtoToEntityConverter(@Lazy final ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    public ShopDto mapToShopDto(final Shop source){
        return (ShopDto) conversionService.convert(source, TypeDescriptor.valueOf(Shop.class),
                TypeDescriptor.valueOf(ShopDto.class));
    }

    public Shop mapToShop(final ShopDto shopDto){
        return (Shop) conversionService.convert(shopDto, TypeDescriptor.valueOf(ShopDto.class),
                TypeDescriptor.valueOf(Shop.class));
    }
}
