package com.springproject.springbootproject.shop.mapper;

import com.springproject.springbootproject.shop.entity.Shop;
import com.springproject.springbootproject.shop.shopdto.ShopDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface ShopMapperToEntity extends Converter<ShopDto, Shop> {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "contactNumber", target = "contactNumber")
    Shop toEntity(ShopDto shopDto);
}
