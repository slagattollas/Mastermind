package com.mastermindstefano.main;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.views.console.View;

public class ConsoleMastermind extends Mastermind {
    @Override
    protected com.mastermindstefano.main.views.View createView(Board board) {
        return new View(board);
    }
    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
