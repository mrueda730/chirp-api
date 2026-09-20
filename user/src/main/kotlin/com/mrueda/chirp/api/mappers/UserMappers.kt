package com.mrueda.chirp.api.mappers

import com.mrueda.chirp.api.dto.AuthenticatedUserDto
import com.mrueda.chirp.api.dto.UserDTO
import com.mrueda.chirp.domain.model.AuthenticatedUser
import com.mrueda.chirp.domain.model.User

fun AuthenticatedUser.toAuthenticatedUserDto(): AuthenticatedUserDto {
    return AuthenticatedUserDto(
        user = user.toUserDto(),
        accessToken = accessToken,
        refreshToken = refreshToken
    )
}

fun User.toUserDto(): UserDTO {
    return UserDTO(
        id = id,
        email = email,
        username = userName,
        hasVerifiedEmail = hasEmailVerified
    )
}