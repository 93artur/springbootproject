package com.springproject.springbootproject.buyer.service.mapper;

import com.springproject.springbootproject.buyer.entity.Buyer;
import com.springproject.springbootproject.buyer.service.BuyerDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface BuyerMapperToEntity extends Converter<BuyerDto, Buyer> {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "balance", target = "balance")
    Buyer toEntity(BuyerDto buyerDto);
}
