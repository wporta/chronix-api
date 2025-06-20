package org.wporta.chronix_api.business.dto;

import jakarta.persistence.Column;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

public record BusinessDTO(
    Long id,
    String name,
    String description,
    String address,
    String phone,
    String cellPhone,
    String email,
    String logoUrl,
    String primaryColor,
    String secondaryColor,
    String currency,
    Boolean active,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
){}