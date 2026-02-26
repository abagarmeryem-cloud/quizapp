package com.telescope.quizapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.telescope.quizapp.DAO.QuestionRepository;
import com.telescope.quizapp.DAO.QuizDAO;
import com.telescope.quizapp.Model.Question;
import com.telescope.quizapp.Model.QuestionWrapper;
import com.telescope.quizapp.Model.Quiz;

@Service
public class QuizService {
    @Autowired
    private QuizDAO quizdao;
    @Autowired
    private QuestionRepository questionDao;

    public ResponseEntity<String> createQuiz(String category,int numQ,String title){
        Pageable pageable = PageRequest.of(0, numQ); // prend les numQ questions
        List<Question> questions=questionDao.findRandomQuestionsByCategory(category,pageable);
        
        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizdao.save(quiz);
        return new ResponseEntity<>("Success",HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Long id) {
        Optional<Quiz> quiz=quizdao.findById(id);
        List<Question> questionFromDB=quiz.get().getQuestions();
        List<QuestionWrapper> questionForUser=new ArrayList<>();
        for (Question q : questionFromDB) {
            QuestionWrapper qw=new QuestionWrapper(q.getId(),q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
            questionForUser.add(qw);
        }
        return new ResponseEntity<List<QuestionWrapper>>(questionForUser, HttpStatus.OK);
    }
}
