package assignment;

import java.util.Arrays;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khangta
 */
public class Question {

    String question;
    Answer[] answers;

    public Question(String question, Answer[] answers) {
        this.question = question;
        this.answers = answers;
        randomAnswer();
    }

    private void randomAnswer() {
        Collections.shuffle(Arrays.asList(answers));
    }

    @Override
    public String toString() {
        return "{"
                + " question='" + question + "'"
                + ", answers='" + answers.toString() + "'"
                + "}";
    }

}
