package com.mat.microbeerservice.web.controller;

import com.mat.microbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getByBeerId(@PathVariable UUID beerId){

        return new ResponseEntity<>(BeerDto.builder().id(beerId).build(), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveNewBeer(@RequestBody BeerDto beerDto){

    }

    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBeerById(@PathVariable UUID beerId, @RequestBody BeerDto beerDto){

    }
}
