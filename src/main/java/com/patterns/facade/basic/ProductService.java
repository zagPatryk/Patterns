package com.patterns.facade.basic;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProductService {
    public BigDecimal getPrice(Long productId) {
        Random random = new Random();
        System.out.println("XXXXXXXX");
        return new BigDecimal(random.nextInt(1000)+1000);
    }
}
