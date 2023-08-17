package com.devira.dividimos

import com.devira.dividimos.database.GuestEntity
import com.devira.dividimos.repository.GuestRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DividimosConfig {

    @Bean
    fun databaseInitializer(guestRepository: GuestRepository) = ApplicationRunner {
        val guest = GuestEntity(
            "roney",
            10.0,
            false,
            emptyList(),
        )
         guestRepository.save(guest)
    }
}