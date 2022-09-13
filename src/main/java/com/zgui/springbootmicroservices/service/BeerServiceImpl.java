package com.zgui.springbootmicroservices.service;

import com.zgui.springbootmicroservices.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Mohamed ouokki
 */
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().beerId(beerId).beerName("OUOKKI's beer").beerStyle("chunk").upc(1L).build();
    }

    @Override
    public BeerDto saveBeer(UUID beerId, BeerDto beerDto) {
        //todo real implementation
        return null;
    }

    @Override
    public BeerDto putBeer(UUID beerId, BeerDto beerDto) {
        //todo real implementation
        return null;
    }

    @Override
    public void deleteBeer(UUID beerId) {
        //todo real implementation
    }
}
