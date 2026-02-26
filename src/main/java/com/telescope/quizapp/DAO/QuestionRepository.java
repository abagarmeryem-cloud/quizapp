package com.telescope.quizapp.DAO;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.telescope.quizapp.Model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByCategory(String category);
    @Query(value = "SELECT * FROM question q WHERE q.category = :category ORDER BY RAND()",nativeQuery = true)    
    List<Question> findRandomQuestionsByCategory(@Param("category") String category,Pageable pageable);
}
