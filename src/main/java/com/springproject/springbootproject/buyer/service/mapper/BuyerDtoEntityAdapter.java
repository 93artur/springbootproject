package com.springproject.springbootproject.buyer.service.mapper;

import com.springproject.springbootproject.buyer.entity.Buyer;
import com.springproject.springbootproject.buyer.service.BuyerDto;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Component;

@Component
public class BuyerDtoEntityAdapter {
    private final ConversionService conversionService;

    public BuyerDtoEntityAdapter(@Lazy final ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    public BuyerDto mapToBuyerDto(final Buyer source){
        return (BuyerDto) conversionService.convert(source, TypeDescriptor.valueOf(Buyer.class),
                TypeDescriptor.valueOf(BuyerDto.class));
    }

    public Buyer mapToBuyer(final BuyerDto buyerDto){
        return (Buyer) conversionService.convert(buyerDto, TypeDescriptor.valueOf(BuyerDto.class),
                TypeDescriptor.valueOf(Buyer.class));
    }
}
