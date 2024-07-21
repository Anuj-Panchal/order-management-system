package com.anuj.order.management.system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "order")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", columnDefinition = "int auto_increment primary key")
    private Integer orderId;

    @Column(name = "product_id", columnDefinition = "int not null")
    private Integer productId;

    @Column(name = "quantity", columnDefinition = "int not null default 1")
    private Integer quantity;

    @Column(name = "staff_id", columnDefinition = "int not null")
    private Integer staffId;

    @Column(name = "customer_id", columnDefinition = "int not null")
    private Integer customerId;

    @Column(name = "order_date", columnDefinition = "date not null")
    private LocalDate orderDate;

    @Column(name = "delivered_at", columnDefinition = "datetime null")
    private LocalDateTime deliveredAt;

    @Column(name = "status", columnDefinition = "int not null default 10")
    private Integer status;

    @Column(name = "is_deleted", columnDefinition = "int not null default 0")
    private Integer isDeleted;

    @Column(name = "created_at", columnDefinition = "datetime not null default current_timestamp", updatable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "datetime not null default current_timestamp on update current_timestamp")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime updatedAt;

    public OrderEntity() {
    }

    public OrderEntity(Integer orderId, Integer productId, Integer quantity, Integer staffId, Integer customerId, LocalDate orderDate, LocalDateTime deliveredAt, Integer status, Integer isDeleted) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.staffId = staffId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.deliveredAt = deliveredAt;
        this.status = status;
        this.isDeleted = isDeleted;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getDeliveredAt() {
        return deliveredAt;
    }

    public void setDeliveredAt(LocalDateTime deliveredAt) {
        this.deliveredAt = deliveredAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(OrderEntity.class, ToStringStyle.JSON_STYLE);
    }
}
