package com.mrueda.chirp.infra.database.mappers

import com.mrueda.chirp.domain.model.User
import com.mrueda.chirp.infra.database.entities.UserEntity

fun UserEntity.toUser(): User {

    return User(
        id = id!!,
        email = email,
        userName = username,
        hasEmailVerified = hasVerifiedEmail
    )

}