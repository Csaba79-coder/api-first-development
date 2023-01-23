package com.csaba79coder.apifirstdevelopment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "log")
public class Log extends BaseEntity {

    @Timestamp
    @Column(name = "logged_at")
    private LocalDateTime loggedAt = LocalDateTime.now();

    @Column(name = "log_message")
    private String logMessage;
}
