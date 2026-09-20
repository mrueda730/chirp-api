package com.mrueda.chirp.infra.database.repositories

import com.mrueda.chirp.domain.model.UserId
import com.mrueda.chirp.infra.database.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, UserId> {
    fun findByEmail(email: String): UserEntity?
    fun findByUsername(username: String): UserEntity?
    fun findByEmailOrUsername(email: String, username: String): UserEntity?
}