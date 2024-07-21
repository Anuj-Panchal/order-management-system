package com.anuj.order.management.system.repository;

import com.anuj.order.management.system.entity.ReviewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends JpaRepository<ReviewsEntity, Integer>, JpaSpecificationExecutor<ReviewsEntity> {
}
