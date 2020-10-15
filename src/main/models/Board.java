package com.mastermindstefano.main.models;

public class Board {
    private static final int ATTEMPTS = 10;
    private HiddenRow hiddenRow;
    private GuessRow[] guessRow;
    private Goal[] goal;
    private int attempt = 0;
    public Board() {
        this.hiddenRow = new HiddenRow();
        this.guessRow = new GuessRow[Board.ATTEMPTS];
        this.goal = new Goal[Board.ATTEMPTS];
        this.attempt = 0;
    }
    public int getAttempts(){
        return this.attempt;
    }
    public String getGuessRow(int index){
        GuessRow row = this.guessRow[index];
        return row.toString();
    }
    public String getGoal(int index){
        Goal row = this.goal[index];
        return row.toString();
    }
    public void addGuessRow(GuessRow guessRow){
        this.guessRow[this.attempt] = guessRow;
        this.goal[this.attempt] = this.hiddenRow.getGoal(guessRow);
        this.attempt++;
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
}
