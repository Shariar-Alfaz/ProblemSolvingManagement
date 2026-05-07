package com.saproduction.problemsolvingmanagement.application.feature.repositories;

import com.saproduction.problemsolvingmanagement.domain.entities.ProblemGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProblemGroupRepository extends JpaRepository<ProblemGroup, UUID> {
}