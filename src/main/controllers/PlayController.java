package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.models.GuessRow;

public class PlayController extends Controller {
    public PlayController(Board board) {
        super(board);
    }
    public boolean isFinished(){
        return this.board.isFinished();
    }
    public int getAttempts(){
        return this.board.getAttempts();
    }
    public String getGuessRow(int index){
        return this.board.getGuessRow(index);
    }
    public String getGoal(int index){
        return this.board.getGoal(index);
    }
    public void addGuessRow(GuessRow guessRow){
        this.board.addGuessRow(guessRow);
    }
}
