package com.stargazer.tdb.repo

import com.stargazer.tdb.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long>
