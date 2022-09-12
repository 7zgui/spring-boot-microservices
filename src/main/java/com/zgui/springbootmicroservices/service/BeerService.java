package com.zgui.springbootmicroservices.service;

import com.zgui.springbootmicroservices.web.model.BeerDto;

import java.util.UUID;

/**
 * @author Mohamed ouokki
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
