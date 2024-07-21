package com.anuj.order.management.system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
public class ReviewsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id", columnDefinition = "int auto_increment primary key")
    private Integer reviewId;

    @Column(name = "reviewer_id", columnDefinition = "int")
    private Integer reviewerId;

    @Column(name = "product_id", columnDefinition = "int")
    private Integer productId;

    @Column(name = "stars", columnDefinition = "int not null default 0")
    private Integer stars;

    @Column(name = "review", columnDefinition = "text not null")
    private String review;

    @Column(name = "created_at", columnDefinition = "datetime not null default current_timestamp", updatable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "datetime not null default current_timestamp on update current_timestamp")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime updatedAt;

    public ReviewsEntity() {
    }

    public ReviewsEntity(Integer reviewId, Integer reviewerId, Integer productId, Integer stars, String review) {
        this.reviewId = reviewId;
        this.reviewerId = reviewerId;
        this.productId = productId;
        this.stars = stars;
        this.review = review;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Integer reviewerId) {
        this.reviewerId = reviewerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
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
        return ToStringBuilder.reflectionToString(ReviewsEntity.class, ToStringStyle.JSON_STYLE);
    }
}
