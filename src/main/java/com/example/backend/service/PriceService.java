package com.example.backend.service;

import com.example.backend.model.Price;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceService {

    List<Price> queryPrice(LocalDateTime implementationDate, int idProduct, int idBrand);
}
