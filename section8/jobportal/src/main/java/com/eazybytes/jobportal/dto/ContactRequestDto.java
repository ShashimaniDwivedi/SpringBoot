package com.eazybytes.jobportal.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

/**
 * DTO for {@link com.eazybytes.jobportal.entity.Contact}
 */
public record ContactRequestDto(
        @NotBlank(message = "Email cannot be empty")
        @Email(message = "Invalid email")
        String email,
        @NotBlank(message = "message cannot be empty")
        @Size(min = 5,max=500,message = "Message must be between 5 and 500 characters")
        String message,
        @NotBlank(message = "name cannot be empty")
        @Size(min = 5,max=30,message = "Name must be between 5 and 30 characters")
        String name,
        @Size(min = 5,max=150,message = "Subject must be between 5 and 150 characters")
        @NotBlank(message = "subject cannot be empty")
        String subject,
        @NotBlank(message = "userType cannot be empty")
        @Pattern(regexp = "Job Seeker|Employer|Other",message = "Select between three of them")
        String userType)
        implements Serializable {
}