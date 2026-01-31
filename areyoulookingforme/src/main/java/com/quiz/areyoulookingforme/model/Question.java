package com.quiz.areyoulookingforme.model;

import java.util.List;

public class Question {

    private int id;
    private String text;
    private List<Answer> answers;

    public Question() {}

    public Question(int id, String text, List<Answer> answers) {
        this.id = id;
        this.text = text;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
