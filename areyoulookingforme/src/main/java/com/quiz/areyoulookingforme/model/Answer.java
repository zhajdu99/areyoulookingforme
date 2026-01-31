package com.quiz.areyoulookingforme.model;

public class Answer {

    private String text;
    private int score;

    public Answer() {}

    public Answer(String text, int score) {
        this.text = text;
        this.score = score;
    }

    public String getText() {
        return text;
    }

    public int getScore() {
        return score;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
