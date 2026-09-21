package com.mrueda.chirp.api.controller

import com.mrueda.chirp.api.dto.RegisterRequestDTO
import com.mrueda.chirp.api.dto.UserDTO
import com.mrueda.chirp.api.mappers.toUserDto
import com.mrueda.chirp.service.auth.AuthService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class AuthController(private val authService: AuthService) {

    @PostMapping("/register")
    fun register(
        @Valid @RequestBody request: RegisterRequestDTO
    ): UserDTO {
        return authService.register(
            email = request.email,
            username = request.username,
            password = request.password
        ).toUserDto()
    }
}