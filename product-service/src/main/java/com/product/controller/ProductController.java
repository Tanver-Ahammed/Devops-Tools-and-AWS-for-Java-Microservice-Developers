package com.product.controller;

import com.product.dto.Coupon;
import com.product.model.Product;
import com.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping("/product/api")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${couponService.url}")
    private String couponServiceUrl;

    @PostMapping("/products")
    public Product create(@RequestBody Product product) {
        Coupon coupon = this.restTemplate.getForObject(couponServiceUrl
                + product.getCouponCode(), Coupon.class);
        product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
        return productRepository.save(product);
    }

    @GetMapping("/products/{id}")
    public Optional<Product> getProductById(@PathVariable("id") long id) {
        return productRepository.findById(id);
    }

}
