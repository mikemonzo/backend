package com.example.backend.controller;

import com.example.backend.model.Price;
import com.example.backend.model.view.PriceViews;
import com.example.backend.service.PriceService;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/price")
@RequiredArgsConstructor
@Slf4j
public class PriceController {

    private final PriceService priceService;

    @GetMapping
    @JsonView(PriceViews.PriceOut.class)
    public List<Price> queryPrice(
            @RequestParam(value = "idProduct", required = false)
            int idProduct,
            @RequestParam(value = "idBrand", required = false)
            int idBrand,
            @RequestParam(value = "implementationDate", required = false)
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
            LocalDateTime implementationDate
    ){
        return priceService.queryPrice(implementationDate, idProduct, idBrand);
    }
}
