package com.mastermindstefano.main;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.views.View;

public abstract class Mastermind {
    private Board board;
    private View view;
    protected Mastermind(){
        this.board = new Board();
        this.view = this.createView(this.board);
    }
    protected abstract View createView(Board board);
    protected void play(){
        this.view.interact();
    }
}
