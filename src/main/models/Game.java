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
    public Game(GuessRow[] guessRow, Goal[] goal, HiddenRow hiddenRow){
        this.hiddenRow = hiddenRow;
        this.goal = goal;
        this.guessRow = guessRow;
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
    public GuessRow[] getGuessRowArray(){
        return this.guessRow;
    }
    public Goal[] getGoalArray(){
        return this.goal;
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
    public void set(Game game){
        Goal[] goal = game.getGoalArray();
        GuessRow[] guessRows = game.getGuessRowArray();
        this.guessRow = guessRows;
        this.goal = goal;
    }
    public Game copy(){
        GuessRow[] guessRowsCopy = new GuessRow[Game.ATTEMPTS];
        Goal[] goalsCopy = new Goal[Game.ATTEMPTS];
        for (int i = 0; i < this.guessRow.length; i++) {
            guessRowsCopy[i] = this.guessRow[i];
            goalsCopy[i] = this.goal[i];
        }
        return new Game(guessRowsCopy, goalsCopy, this.hiddenRow);
    }
}
