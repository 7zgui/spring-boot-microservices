package com.zgui.springbootmicroservices.service;

import com.zgui.springbootmicroservices.web.model.BeerDto;

import java.util.UUID;

/**
 * @author Mohamed ouokki
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(UUID beerId, BeerDto beerDto);

    BeerDto putBeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);
}
