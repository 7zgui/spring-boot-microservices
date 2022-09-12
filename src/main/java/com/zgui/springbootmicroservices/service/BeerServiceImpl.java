package com.zgui.springbootmicroservices.service;

import com.zgui.springbootmicroservices.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Mohamed ouokki
 */
@Service
public class BeerServiceImpl implements BeerService {
    private BeerService beerService;

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().beerId(beerId).beerName("OUOKKI's beer").beerStyle("chunk").upc(1L).build();
    }
}
