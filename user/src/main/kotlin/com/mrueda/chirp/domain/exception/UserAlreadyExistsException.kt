package com.mrueda.chirp.domain.exception

class UserAlreadyExistsException() : RuntimeException(
    "User with email or username already exists"
)