package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Board;

public class ResumeController extends Controller {
    public ResumeController(Board board) {
        super(board);
    }
    public void clear(){
        this.board.clear();
    }
}
