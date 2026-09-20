package com.mrueda.chirp.infra.security

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Component

@Component
class PasswordEncoder {

    private val encoder = BCryptPasswordEncoder()

    fun encode(password: String): String? {
        return encoder.encode(password)
    }

    fun matches(password: String, encoded: String): Boolean {
        return encoder.matches(password, encoded)
    }

}