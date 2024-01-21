package com.product.dto;

import java.math.BigInteger;

public class Coupon {

    private Long id;

    private String code;

    private BigInteger discount;

    private String expDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigInteger getDiscount() {
        return discount;
    }

    public void setDiscount(BigInteger discount) {
        this.discount = discount;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

}
