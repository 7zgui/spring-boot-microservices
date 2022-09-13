package com.zgui.springbootmicroservices.web.controller;

import com.zgui.springbootmicroservices.service.BeerService;
import com.zgui.springbootmicroservices.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Mohamed ouokki
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private BeerService beerService;

    public BeerController(BeerService beerService){
        this.beerService=beerService;
    }

    @GetMapping(value = "/{beerId}")
    ResponseEntity<BeerDto> getBeer(@PathVariable(value = "beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping(value="/{beerId}")
    ResponseEntity<BeerDto> saveBeer(@PathVariable(value = "beerId") UUID beerId, @RequestBody BeerDto beerDto){
        return new ResponseEntity<>(beerService.saveBeer(beerId,beerDto),HttpStatus.CREATED);
    }
}
