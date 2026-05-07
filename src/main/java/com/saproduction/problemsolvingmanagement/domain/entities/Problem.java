package com.saproduction.problemsolvingmanagement.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "problems")
public class Problem {
    @Id
    @ColumnDefault("gen_random_uuid()")
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "group_id", nullable = false)
    private ProblemGroup group;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "difficulty", nullable = false, length = 20)
    private String difficulty;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "input_format", length = Integer.MAX_VALUE)
    private String inputFormat;

    @Column(name = "output_format", length = Integer.MAX_VALUE)
    private String outputFormat;

    @Column(name = "constraints", length = Integer.MAX_VALUE)
    private String constraints;

    @ColumnDefault("now()")
    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @ColumnDefault("now()")
    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;

    @OneToMany(mappedBy = "problem")
    @Builder.Default
    private Set<ProblemSolution> problemSolutions = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "problem_tags", joinColumns = @JoinColumn(name = "problem_id"), inverseJoinColumns = @JoinColumn(name = "tag_id"))
    @Builder.Default
    private Set<Tag> tags = new HashSet<>();

    public void addTag(Tag tag) {
        tag.getProblems().add(this);
        this.tags.add(tag);
    }
    public void removeTag(Tag tag) {
        tag.getProblems().remove(this);
        this.tags.remove(tag);
    }

}