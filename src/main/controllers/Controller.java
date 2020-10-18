package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.models.State;

public abstract class Controller {
    protected Board board;
    protected State state;

    Controller(Board board, State state){
        this.board = board;
        this.state = state;
    }

    public void next(){
        this.state.next();
    }
    public abstract void accept(ControllerVisitor controllerVisitor);

}
