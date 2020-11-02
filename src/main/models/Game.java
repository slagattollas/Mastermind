package com.mastermindstefano.main.models;

public class Game {
    private static final int ATTEMPTS = 10;
    private HiddenRow hiddenRow;
    private GuessRow[] guessRow;
    private Goal[] goal;
    private int attempt = 0;
    public Game() {
        this.hiddenRow = new HiddenRow();
        this.guessRow = new GuessRow[Game.ATTEMPTS];
        this.goal = new Goal[Game.ATTEMPTS];
        this.attempt = 0;
    }
    public void clear() {
        this.hiddenRow = new HiddenRow();
        this.guessRow = new GuessRow[Game.ATTEMPTS];
        this.goal = new Goal[Game.ATTEMPTS];
        this.attempt = 0;
    }
    public int getAttempts(){
        return this.attempt;
    }
    public String getGuessRow(int index){
        GuessRow row = this.guessRow[index];
        return row.getRowString();
    }
    public String getGoal(int index){
        Goal row = this.goal[index];
        return row.getGoalString();
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
        return this.attempt == Game.ATTEMPTS;
    }
}
