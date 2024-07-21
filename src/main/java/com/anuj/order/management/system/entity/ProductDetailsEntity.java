package com.anuj.order.management.system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDateTime;

@Entity
@Table(name = "product_details")
public class ProductDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", columnDefinition = "int auto_increment primary key")
    private Integer productId;

    @Column(name = "product_name", columnDefinition = "varchar(255) not null")
    private String productName;

    @Column(name = "category_id", columnDefinition = "int")
    private Integer categoryId;

    @Column(name = "product_image", columnDefinition = "text null")
    private String productImage;

    @Column(name = "price", columnDefinition = "double default 0 not null")
    private Double price;

    @Column(name = "description", columnDefinition = "text null")
    private String description;

    @Column(name = "is_deleted", columnDefinition = "int not null default 0")
    private Integer isDeleted;

    @Column(name = "created_at", columnDefinition = "datetime not null default current_timestamp", updatable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "datetime not null default current_timestamp on update current_timestamp")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime updatedAt;

    public ProductDetailsEntity() {
    }

    public ProductDetailsEntity(Integer productId, String productName, Integer categoryId, String productImage, Double price, String description, Integer isDeleted) {
        this.productId = productId;
        this.productName = productName;
        this.categoryId = categoryId;
        this.productImage = productImage;
        this.price = price;
        this.description = description;
        this.isDeleted = isDeleted;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return ToStringBuilder.reflectionToString(ProductDetailsEntity.class, ToStringStyle.JSON_STYLE);
    }
}
