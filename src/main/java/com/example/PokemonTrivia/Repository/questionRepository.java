package com.example.PokemonTrivia.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.example.PokemonTrivia.POJOs.Question;

@Repository
public class questionRepository {
    private List<Question> questions = Arrays.asList(
        new Question("What is Deadpool's real name?", "Wade Wilson"),
        new Question("In the comics and the X-men films , who is Quicksilver and Scarlet Witches father?", "Magneto"),
        new Question("What metal is bonded to Wolverine's skeleton?", "Adamantium"),
        new Question("In the comics, what is the name of Thor's alter ego?", "Donald Blake"),
        new Question("What is Luke Cage's real name?", "Carl Lucas"),
        new Question("What is the name of the team of 6 villains who team against Spider-Man?", "Sinister Six.The group consists of Green Goblin, Doctor Octopus, Sandman, Electro, Vulture,and Mysterio."),
        new Question("Hulk was originally what color?", "Grey"),
        new Question("The original members of the Fantastic four were Mr. Fantastic, Invisible Girl, Human Torch and Thing. What were their real names?", "Reed Richards, Susan Storm, Johnny Storm and Ben Grimm"),
        new Question("Ant-Man has had a number of incarnations. Which of these was his first?", "Hank Pym"),
        new Question("What is the real name of the member of the Uncanny X-Men known as Nightcrawler?", "Kurt Wagner"),
        new Question("Who is the villain who killed Gwen Stacy, Spider-man's first Love?", "Green Goblin"),
        new Question("Which of the following comic book magazines printed the first story starring Doctor Strange?","Strange Tales"),
        new Question("Although a member of the Avengers for a very long time, Hawkeye made his first appearance in which comic series?", "Tales of Suspense"),
        new Question("In what Marvel Comics title did the Silver Surfer first start soaring the skies?", "The Fantastic Four"),
        new Question("What was Marvel's very first major title?", "The Fantastic Four"),
        new Question("What is Professor X's school called?", "Xavier's School for Gifted Youngsters"),
        new Question("Who is the Hulk's female cousin?", "She-Hulk"),
        new Question("What newspaper does Peter Parker work for?", "Daily Bugle"),
        new Question("What is Jessica Jones' post-superhero day job?", "Private Investigator"),
        new Question("By what superhero alias is Johnny Blaze better known?", "Ghost Rider"),
        new Question("What’s the name of Wolverine’s mutant son in the comics?", "Draken"),
        new Question("In the comics, who’s the first avenger to quit the team?", "Hulk"),
        new Question("Who did The Winter Soldier take shelter with during “Infinity War”?", "Black Panther"),
        new Question("Who designed the Quinjet?", "Black Panther"),
        new Question("Who is Wolverine’s biggest enemy?", "Sabretooth")
    );

    public Question getRandomQuestion() {

        if (!questions.get(0).getChecked()) {
            questions.get(0).setChecked(true);
            return questions.get(0);
        } else {
            Collections.shuffle(questions);
            return getRandomQuestion();
        }
    }

    public void removeQuestion(String id) {
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getId().equals(id)) {

            }
        }
    }

    public void shuffleQuestions() {
        Collections.shuffle(questions);
    }

    public void resetList(){
        for(int i = 0; i < questions.size(); i++){
            questions.get(i).setChecked(false);
        }
    }
}
