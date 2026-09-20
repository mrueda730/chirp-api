package com.mrueda.chirp.api.dto

data class AuthenticatedUserDto(
    val user: UserDTO,
    val accessToken: String,
    val refreshToken: String
)