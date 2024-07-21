package com.anuj.order.management.system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDateTime;

@Entity
@Table(name = "staff")
public class StaffEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id", columnDefinition = "int auto_increment primary key")
    private Integer staffId;

    @Column(name = "first_name", columnDefinition = "varchar(255) not null")
    private String firstName;

    @Column(name = "last_name", columnDefinition = "varchar(255) not null")
    private String lastName;

    @Column(name = "email_id", columnDefinition = "varchar(255) not null")
    private String emailId;

    @Column(name = "role", columnDefinition = "varchar(255) not null")
    private String role;

    @Column(name = "is_deleted", columnDefinition = "int not null default 0")
    private Integer isDeleted;

    @Column(name = "created_at", columnDefinition = "datetime not null default current_timestamp", updatable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "datetime not null default current_timestamp on update current_timestamp")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime updatedAt;

    public StaffEntity() {
    }

    public StaffEntity(Integer staffId, String firstName, String lastName, String emailId, String role, Integer isDeleted) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.role = role;
        this.isDeleted = isDeleted;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
        return ToStringBuilder.reflectionToString(StaffEntity.class, ToStringStyle.JSON_STYLE);
    }
}
