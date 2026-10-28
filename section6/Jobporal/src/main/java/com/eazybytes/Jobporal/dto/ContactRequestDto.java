package com.eazybytes.Jobporal.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.eazybytes.Jobporal.entity.Contact}
 */
public record ContactRequestDto(String email, String message, String name, String subject,
                                String userType) implements Serializable {
}