package com.anuj.order.management.system.repository;

import com.anuj.order.management.system.entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StaffRepository extends JpaRepository<StaffEntity, Integer>, JpaSpecificationExecutor<StaffEntity> {
}
