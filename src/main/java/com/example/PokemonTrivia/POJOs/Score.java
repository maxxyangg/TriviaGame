package com.example.PokemonTrivia.POJOs;

public class Score {
    
    private int score;
    private int total;


    public Score() {
    }

    public Score(int score, int total) {
        this.score = score;
        this.total = total;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Score score(int score) {
        setScore(score);
        return this;
    }

    public Score total(int total) {
        setTotal(total);
        return this;
    }



}
