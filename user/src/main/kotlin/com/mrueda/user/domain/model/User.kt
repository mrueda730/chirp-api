package com.mrueda.user.domain.model

import java.util.UUID

data class User(
    val id: UUID,
    val userName: String,
    val email: String,
    val hasEmailVerified: Boolean
)