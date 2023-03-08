package com.example.backend.service.impl;

import com.example.backend.model.Price;
import com.example.backend.repository.PriceRepository;
import com.example.backend.service.PriceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class PriceServiceImpl implements PriceService {
    private final PriceRepository priceRepository;

    @Override
    public List<Price> queryPrice(LocalDateTime implementationDate, int idProduct, int idBrand) {
        return priceRepository.queryPrice(implementationDate, idProduct, idBrand);
    }
}
