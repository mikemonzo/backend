package com.example.backend.repository;

import com.example.backend.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;


public interface PriceRepository extends JpaRepository<Price, Integer> {
    @Query("select p from Price p where p.startDate <= :implementationDate and p.endDate >= :implementationDate " +
            "and p.idProduct = :idProduct and p.idBrand = :idBrand"
    )
    List<Price> queryPrice(
            @Param("implementationDate") LocalDateTime implementationDate,
            @Param("idProduct") int idProduct,
            @Param("idBrand") int idBrand
    );
}
