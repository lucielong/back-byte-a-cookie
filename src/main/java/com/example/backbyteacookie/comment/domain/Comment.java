package com.example.backbyteacookie.comment.domain;

import com.example.backbyteacookie.recipe.domain.Recipe;
import com.example.backbyteacookie.user.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@Entity
@Table(name = "comment")
@Builder
@Data
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_id_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    private int rating;
    private String body;
    private ZonedDateTime date;

    public Comment() {
    }
}
