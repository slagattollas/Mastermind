package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.models.State;

public class ResumeController extends Controller {
    public ResumeController(Board board, State state) {
        super(board,state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public void clear(){
        this.state.reset();
        this.board.clear();
    }
}
