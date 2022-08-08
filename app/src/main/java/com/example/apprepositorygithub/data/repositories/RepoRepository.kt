package com.example.apprepositorygithub.data.repositories

import com.example.apprepositorygithub.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user : String): Flow<List<Repo>>
}