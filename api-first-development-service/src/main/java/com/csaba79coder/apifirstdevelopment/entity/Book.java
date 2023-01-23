package com.csaba79coder.apifirstdevelopment.entity;

import com.csaba79coder.apifirstdevelopment.value.Availability;
import com.csaba79coder.apifirstdevelopment.value.Genre;
import com.csaba79coder.apifirstdevelopment.value.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Where(clause = "availability != 'DELETED'")
public class Book extends BaseEntity {

    @Column(name = "created_by", nullable = false)
    private UUID createdBy = UUID.fromString("3a8ea9f1-1a95-4caf-932f-2f988052933b");

    @Column(name = "updated_by", nullable = false)
    private UUID updatedBy = UUID.fromString("9e91103b-ef57-4d61-983c-28dfdd7e332a");

    @Timestamp
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Timestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();
    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "isbn", nullable = false, unique = true, length = 13)
    private Long isbn;

    @Column(name = "genre", nullable = false)
    @Enumerated(EnumType.STRING)
    private Genre genre = Genre.OTHER;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status = Status.AVAILABLE;

    @Column(name = "availability", nullable = false)
    @Enumerated(EnumType.STRING)
    private Availability availability = Availability.AVAILABLE;
}
