package com.miaosha.service.Model;

import java.math.BigDecimal;
import java.nio.file.AccessMode;

public class OrderModel {
    private String id;

    private Integer userId;

    private Integer itemId;

    //购买商品的单价，若promoid非空，表示秒杀商品的单价
    private BigDecimal itemPrice;

    //购买数量
    private Integer amount;

    //购买金额,若promoid非空，表示秒杀商品的价格
    private BigDecimal orderPrice;

    //若非空，表示以秒杀方式下单
    private Integer promoId;

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }
}
