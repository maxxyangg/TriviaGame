package com.example.PokemonTrivia.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.PokemonTrivia.POJOs.Question;
import com.example.PokemonTrivia.Repository.questionRepository;

@Service
public class questionService {
    
    @Autowired
    private questionRepository questionRepo;

    public Question getRandomQuestion(){
        return questionRepo.getRandomQuestion();
    }

    public void removeQuestion(String id){
        questionRepo.removeQuestion(id);
    }

    public boolean checkAnswer(Question question){
        if(question.getAnswer() == null){
            return false;
        }
        
        if(question.getcorrectAnswer().equalsIgnoreCase(question.getAnswer())){
            return true;
        }else if(!question.getcorrectAnswer().equalsIgnoreCase(question.getAnswer())){
            return false;
        }else{
            return false;
        }
    }

    public void shuffleQuestions() {
        questionRepo.shuffleQuestions();
    }

    public boolean getScore(int numQuestions, int correct, int incorrect){
        if(numQuestions < 20){
            return false;
        }else{
            return true;
        }
    }

    public void resetList(){
        questionRepo.resetList();
    }


}
