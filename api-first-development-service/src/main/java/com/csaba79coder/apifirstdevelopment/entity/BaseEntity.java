package com.csaba79coder.apifirstdevelopment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;

@MappedSuperclass
public class BaseEntity {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id = UUID.randomUUID();
}
