package com.mastermindstefano.main;

import com.mastermindstefano.utils.Print;

import java.util.Arrays;

public class Board {
    private static final int ATTEMPTS = 10;
    private HiddenRow hiddenRow;
    private GuessRow[] guessRow;
    private Goal[] goal;
    private int attempt = 0;
    Board() {
        this.hiddenRow = new HiddenRow();
        this.guessRow = new GuessRow[Board.ATTEMPTS];
        this.goal = new Goal[Board.ATTEMPTS];
        this.attempt = 0;
    }
    public void writeln(){
        Print.instance().writeln();
        Message.NUMBER_ATTEMPTS.writeln(this.attempt);
        for (int i = 0; i < this.attempt; i++){
            this.guessRow[i].print();
            this.goal[i].writeln();
        }
    }
    public boolean isFinished(){
        return this.isWinner() || this.isLooser();
    }
    public boolean isWinner(){
        return this.goal[this.attempt - 1].guessed();
    }
    public boolean isLooser(){
        return this.attempt == Board.ATTEMPTS;
    }
    public void add(GuessRow guessRow){
        this.guessRow[this.attempt] = guessRow;
        this.goal[this.attempt] = this.hiddenRow.getGoal(guessRow);
        this.attempt++;
    }
}
