package com.telescope.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telescope.quizapp.DAO.QuestionRepository;
import com.telescope.quizapp.Model.Question;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getAllQuestions(){
        return questionRepository.findAll();       
    }

    public List<Question> getByCategory(String category){
        return questionRepository.findByCategory(category);
    }
    
    public String addQuestion(Question question){
        questionRepository.save(question);
        return "Succès";
    }

}
