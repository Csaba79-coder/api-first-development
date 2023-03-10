package com.csaba79coder.apifirstdevelopment.persistence;

import com.csaba79coder.apifirstdevelopment.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LogRepository extends JpaRepository<Log, UUID> {
}
