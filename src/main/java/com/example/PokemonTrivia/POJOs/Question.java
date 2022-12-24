package com.example.PokemonTrivia.POJOs;

import java.util.UUID;

public class Question {
    private String question;
    private String correctAnswer;
    private String answer;
    private boolean checked;
    private String id;

    public Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.id = UUID.randomUUID().toString();
    }

    public Question() {
        this.id = UUID.randomUUID().toString();
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getcorrectAnswer() {
        return this.correctAnswer;
    }

    public void setcorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public boolean isChecked() {
        return this.checked;
    }

    public boolean getChecked() {
        return this.checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }


    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


}
