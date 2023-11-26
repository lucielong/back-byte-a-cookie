package com.example.backbyteacookie.comment.persistence;

import com.example.backbyteacookie.comment.domain.Comment;

import java.util.List;


public interface CommentDao {
    List<Comment> findAll();

    Comment findById(long id);

    Comment create(Comment comment);

    Comment update(Comment comment);

    void delete(long id);

    List<Comment> findByRecipeId(long recipeId);

    double ratingAverage(long recipeId);

    Long count(long recipeId);

}
