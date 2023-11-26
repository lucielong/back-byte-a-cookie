package com.example.backbyteacookie.recipe.domain;

import com.example.backbyteacookie.comment.domain.Comment;
import com.example.backbyteacookie.models.Image;
import com.example.backbyteacookie.user.domain.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;


@Entity
@Table(name = "recipe")
@Builder
@Data
@AllArgsConstructor
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recipe_id_seq")
    private Long id;

    private String name;

    @OneToOne(orphanRemoval = true)
    private Image image;

    private String description;

    @Enumerated(EnumType.STRING)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Difficulty difficulty;

    @Column(name = "time", nullable = false)
    private int time;


    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    private ZonedDateTime date;

    @Column(name = "ingredients")
    private String ingredients;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Comment> comments;

    public Recipe() {
    }

}
