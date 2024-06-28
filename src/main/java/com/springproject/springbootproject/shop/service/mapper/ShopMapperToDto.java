package com.springproject.springbootproject.shop.service.mapper;

import com.springproject.springbootproject.shop.entity.Shop;
import com.springproject.springbootproject.shop.service.ShopDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface ShopMapperToDto extends Converter<Shop, ShopDto> {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "contactNumber", target = "contactNumber")
    ShopDto toDto(Shop shop);
}