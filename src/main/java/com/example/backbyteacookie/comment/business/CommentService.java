package com.example.backbyteacookie.comment.business;

import com.example.backbyteacookie.comment.domain.Comment;

import java.util.List;


public interface CommentService {

    List<Comment> findAll();

    Comment findById(long id);

    void delete(long id);

    Comment create(Comment comment);

    Comment update(Comment comment);

    List<Comment> findByRecipeId(long recipeId);

    double ratingAverage(long recipeId);

    Long count(long recipeId);
}
