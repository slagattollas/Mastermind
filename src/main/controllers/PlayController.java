package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.models.GuessRow;
import com.mastermindstefano.main.models.State;

public class PlayController extends Controller {
    public PlayController(Board board, State state) {
        super(board, state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
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
