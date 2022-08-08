package com.example.apprepositorygithub.domain

import com.example.apprepositorygithub.core.UseCase
import com.example.apprepositorygithub.data.model.Repo
import com.example.apprepositorygithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String) : Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}