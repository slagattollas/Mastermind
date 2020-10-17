package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Board;

public abstract class Controller {
    protected Board board;

    Controller(Board board){
        this.board = board;
    }


}
