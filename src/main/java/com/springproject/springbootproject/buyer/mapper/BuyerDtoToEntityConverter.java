package com.springproject.springbootproject.buyer.mapper;

import com.springproject.springbootproject.buyer.entity.Buyer;
import com.springproject.springbootproject.buyer.buyerdto.BuyerDto;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Component;

@Component
public class BuyerDtoToEntityConverter {
    private final ConversionService conversionService;

    public BuyerDtoToEntityConverter(@Lazy final ConversionService conversionService) {
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
