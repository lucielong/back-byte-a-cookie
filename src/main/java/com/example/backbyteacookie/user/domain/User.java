package com.example.backbyteacookie.user.domain;

import com.example.backbyteacookie.comment.domain.Comment;

import com.example.backbyteacookie.models.Image;

import com.example.backbyteacookie.recipe.domain.Recipe;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "client")
@Builder
@Data
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_id_seq")
    private Long id;
    private String name;

    @OneToOne(orphanRemoval = true)
    private Image profilePicture;

    private String email;
    @JsonIgnore
    private byte[] password;

    @OneToMany(mappedBy = "client")
    @JsonIgnore
    private List<Recipe> recipes;

    @OneToMany(mappedBy = "client")
    @JsonIgnore
    private List<Comment> comments;

    public User() {
    }

}
