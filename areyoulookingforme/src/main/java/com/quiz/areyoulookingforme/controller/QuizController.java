package com.quiz.areyoulookingforme.controller;

import com.quiz.areyoulookingforme.model.Question;
import com.quiz.areyoulookingforme.service.QuizService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/api/questions")
    public List<Question> getQuestions() {
        return quizService.getQuestions();
    }
}
