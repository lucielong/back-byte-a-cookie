package com.example.backbyteacookie.user.controller;

import com.example.backbyteacookie.comment.domain.Comment;
import com.example.backbyteacookie.recipe.domain.Recipe;
import com.example.backbyteacookie.user.domain.User;
import com.example.backbyteacookie.user.business.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RequestMapping("users")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("")
    @Operation(summary = "Get a list of all existing users")
    public List<User> listUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a specific user by its ID")
    public User getUserById(@Parameter(description = "ID of the user to get", required = true) @PathVariable Long id) {
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remove a given user")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Edit a given user")
    public void updateUser(@PathVariable User user) {
        userService.update(user);
    }


}
