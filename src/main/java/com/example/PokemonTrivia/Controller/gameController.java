package com.example.PokemonTrivia.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.PokemonTrivia.POJOs.Answer;
import com.example.PokemonTrivia.POJOs.Question;
import com.example.PokemonTrivia.POJOs.Score;
import com.example.PokemonTrivia.Service.questionService;


@Controller
public class gameController {

    @Autowired
    private questionService service;
    private Question oldQuestion;

    private int counter = 0;
    private int correct = 0;
    private int incorrect = 0;

    @GetMapping("/start")
    public String gamePage(Model model){
        service.shuffleQuestions();
        Question tempQuestion = service.getRandomQuestion();
        model.addAttribute("question", tempQuestion);
        counter++;
        return "gamepage"; 
    }

    @GetMapping("/handleSubmit")
    public String handleSubmit(Question question){
        if(service.checkAnswer(question)){
            return "redirect:/correctScreen";
        }else{
            return "redirect:/incorrectScreen";
        }
    }

    @GetMapping("/correctScreen")
    public String correctScreen(Model model){
        if(counter == 20){
            model.addAttribute("score", new Score(correct,counter));
            service.resetList();
            counter = 0;
            incorrect = 0;
            correct = 0;
            return "scorePage";
        }
        service.shuffleQuestions();
        Question tempQuestion = service.getRandomQuestion();
        model.addAttribute("question", tempQuestion);
        System.out.println(counter);
        counter++;
        correct++;
        return "correctScreen";
    }

    @GetMapping("/incorrectScreen")
    public String incorrectScreen(Model model){
        if(counter == 20){
            model.addAttribute("score", new Score(correct,counter));
            service.resetList();
            counter = 0;
            incorrect = 0;
            correct = 0;
            return "scorePage";
        }
        service.shuffleQuestions();
        Question tempQuestion = service.getRandomQuestion();
        model.addAttribute("question", tempQuestion);
        System.out.println(counter);
        counter++;
        incorrect++;
        return "incorrectScreen";
    }

    
    

}
