package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.models.GuessRow;

public class Logic {
    private Board board;
    private PlayController playController;
    private ResumeController resumeController;
    public Logic() {
        this.board = new Board();
        this.playController = new PlayController(this.board);
        this.resumeController = new ResumeController(this.board);
    }
    public void clear(){
        this.resumeController.clear();
    }
    public boolean isFinished(){
        return this.playController.isFinished();
    }
    public int getAttempts(){
        return this.playController.getAttempts();
    }
    public String getGuessRow(int index) {
        return this.playController.getGuessRow(index);
    }
    public String getGoal(int index){
        return this.playController.getGoal(index);
    }
    public void addGuessRow(GuessRow guessRow){
        this.board.addGuessRow(guessRow);
    }
}
