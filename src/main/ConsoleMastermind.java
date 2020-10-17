package com.mastermindstefano.main;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.views.console.View;

public class ConsoleMastermind {
    private Board board;
    private View view;
    ConsoleMastermind(){
        this.board = new Board();
        this.view = new View(this.board);
    }
    public void play(){
        this.view.interact();
    }
    
    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
