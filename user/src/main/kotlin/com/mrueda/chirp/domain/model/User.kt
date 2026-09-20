package com.mrueda.chirp.domain.model

import java.util.UUID

typealias UserId = UUID

data class User(
    val id: UserId,
    val userName: String,
    val email: String,
    val hasEmailVerified: Boolean
)