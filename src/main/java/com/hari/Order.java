package com.hari;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Access(AccessType.PROPERTY)
@javax.persistence.Table(name = "Order_data")
public class Order extends PanacheEntityBase {

    private Long orderId;
    private String custName;
    private String productName;
    private Integer productQuantity;
    private Integer totalPrice;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id", unique = true, nullable = false)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order() {

    }

    public Order(Long orderId, String custName, String productName, Integer productQuantity, Integer totalPrice) {
        this.orderId = orderId;
        this.custName = custName;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", custName=" + custName + ", productName=" + productName
                + ", productQuantity=" + productQuantity + ", totalPrice=" + totalPrice + "]";
    }

}
