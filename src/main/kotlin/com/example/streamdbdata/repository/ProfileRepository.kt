package com.example.streamdbdata.repository

import com.example.streamdbdata.model.Profile
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ProfileRepository : ReactiveCrudRepository<Profile, Long>
