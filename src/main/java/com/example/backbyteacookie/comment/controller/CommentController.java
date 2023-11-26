package com.example.backbyteacookie.comment.controller;

import com.example.backbyteacookie.comment.business.CommentService;
import com.example.backbyteacookie.comment.domain.Comment;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("comments")
@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @GetMapping("")
    @Operation(summary = "Get all existing reviews")
    public List<Comment> listComments() {
        return commentService.findAll();
    }

    @PostMapping("")
    @Operation(summary = "Create a new review")
    public void addComment(@RequestBody Comment comment) { commentService.create(comment);}

    @GetMapping("/{id}")
    @Operation(summary = "Get a specific review by its ID")
    public Comment getCommentById(@PathVariable Long id) {
        return commentService.findById(id);
    }

    @GetMapping("/byRecipe/{recipeId}")
    @Operation(summary = "Get all reviews for a given recipe")
    public List<Comment> getCommentsByRecipe(@PathVariable Long recipeId) { return commentService.findByRecipeId(recipeId);}

    @GetMapping("/ratingAverage/{recipeId}")
    @Operation(summary = "Get the average rating for a given recipe")
    public double getRatingAverage(@PathVariable Long recipeId) { return commentService.ratingAverage(recipeId);}

    @GetMapping("/count/{recipeId}")
    @Operation(summary = "Get the number of reviews")
    public Long count(@PathVariable Long recipeId) { return commentService.count(recipeId);}
}
