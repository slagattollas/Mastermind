package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.models.State;

public class StartController extends Controller {
    public StartController(Board board, State state) {
        super(board, state);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
