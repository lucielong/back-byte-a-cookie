package com.example.backbyteacookie.comment.business;

import com.example.backbyteacookie.comment.domain.Comment;
import com.example.backbyteacookie.comment.persistence.CommentDao;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentDao commentDao;

    CommentServiceImpl(CommentDao commentDao) {
        this.commentDao = commentDao;
    }

    @Override
    public List<Comment> findAll() {
        return commentDao.findAll();
    }

    @Override
    public Comment findById(long id) {
        return commentDao.findById(id);
    }

    @Override
    @Transactional
    public void delete(long id) {
        commentDao.delete(id);
    }

    @Override
    @Transactional
    public Comment create(Comment comment) {
        return commentDao.create(comment);
    }

    @Override
    public Comment update(Comment comment) {
        return commentDao.update(comment);
    }

    @Override
    public List<Comment> findByRecipeId(long recipeId) {
        return commentDao.findByRecipeId(recipeId);
    }

    @Override
    public double ratingAverage(long recipeId) {
        return commentDao.ratingAverage(recipeId);
    }

    @Override
    public Long count(long recipeId) {
        return commentDao.count(recipeId);
    }
}
