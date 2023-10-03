package assignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khangta
 */
public class Player {

    String name;
    int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    void addScore() {
        score++;
    }
}
