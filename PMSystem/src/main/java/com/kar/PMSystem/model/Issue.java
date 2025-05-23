package com.kar.PMSystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Title;
    private String description;
    private String status;
    private Long projectID;
    private String priority;
    private LocalDate dueDate;
    private final List<String> tags=new ArrayList<>();


    @ManyToOne
    private User assignee;

    @ManyToOne
    private Project project;

    @JsonIgnore
    @OneToMany(mappedBy = "issue", cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<Comment> comments=new ArrayList<>();
}
