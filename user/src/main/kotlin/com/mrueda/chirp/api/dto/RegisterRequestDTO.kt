package com.mrueda.chirp.api.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Pattern
import org.hibernate.validator.constraints.Length


data class RegisterRequestDTO(
    @field:Email(message = "Invalid email format")
    val email: String,
    @field:Length(min = 3, max = 100, message = "Username must be between 3 and 100 characters")
    val username: String,
    @field:Pattern(
        regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@\$!%*?&])[A-Za-z\\d@\$!%*?&]{8,}\$",
        message = "Password must be at least 8 characters long and include at least one uppercase letter, one lowercase letter, one number, and one special character"
    )
    val password: String
)