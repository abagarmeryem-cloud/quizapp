package com.telescope.quizapp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telescope.quizapp.Model.Quiz;

public interface QuizDAO extends JpaRepository<Quiz,Long> {

} 
