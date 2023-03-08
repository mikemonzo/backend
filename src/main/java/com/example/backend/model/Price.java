package com.example.backend.model;

import com.example.backend.model.view.PriceViews;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JsonView({PriceViews.PriceOut.class})
    @Column(nullable = false)
    private int idBrand;
    @JsonView({PriceViews.PriceOut.class})
    @Column(nullable = false)
    private LocalDateTime startDate;
    @JsonView({PriceViews.PriceOut.class})
    @Column(nullable = false)
    private LocalDateTime endDate;
    @JsonView({PriceViews.PriceOut.class})
    @Column(nullable = false)
    private int listPrice;
    @JsonView({PriceViews.PriceOut.class})
    @Column(nullable = false)
    private int idProduct;
    private int priority;
    @JsonView({PriceViews.PriceOut.class})
    @Column(nullable = false)
    private BigDecimal price;
    @JsonView({PriceViews.PriceOut.class})
    @Column(nullable = false)
    private String curr;
}
