package com.quiz.areyoulookingforme.service;

import com.quiz.areyoulookingforme.model.Question;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class QuizService {

    public List<Question> getQuestions() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = getClass().getResourceAsStream("/questions.json");
            return mapper.readValue(is, new TypeReference<List<Question>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Failed to load questions", e);
        }
    }
}
