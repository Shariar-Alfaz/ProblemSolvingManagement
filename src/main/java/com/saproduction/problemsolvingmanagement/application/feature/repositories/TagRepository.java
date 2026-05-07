package com.saproduction.problemsolvingmanagement.application.feature.repositories;

import com.saproduction.problemsolvingmanagement.domain.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TagRepository extends JpaRepository<Tag, UUID> {
}