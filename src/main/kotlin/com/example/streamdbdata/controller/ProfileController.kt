package com.example.streamdbdata.controller

import com.example.streamdbdata.model.Profile
import com.example.streamdbdata.repository.ProfileRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class ProfileController(val profileRepository: ProfileRepository) {

    @PostMapping("/profile")
    fun save(@RequestBody profile: Profile): Mono<Profile> = profileRepository.save(profile)

}
