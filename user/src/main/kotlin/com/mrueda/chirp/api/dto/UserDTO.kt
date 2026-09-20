package com.mrueda.chirp.api.dto

import com.mrueda.chirp.domain.model.UserId

data class UserDTO(
    val id: UserId,
    val email: String,
    val username: String,
    val hasVerifiedEmail: Boolean,
)