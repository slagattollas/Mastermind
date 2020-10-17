package com.mastermindstefano.main.views;

import com.mastermindstefano.main.models.Board;

public abstract class View {
    protected Board board;
    public View(Board board){
        this.board = board;
    }
    public void interact(){
        do {
            this.start();
            this.play();
        }while(this.isResumed());
    }
    protected abstract void start();
    protected abstract void play();
    protected abstract boolean isResumed();
}
