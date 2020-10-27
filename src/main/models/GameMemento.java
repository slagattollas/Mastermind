package com.mastermindstefano.main.models;

public class GameMemento {
    private Board board;

    GameMemento(Board board){
        this.board = board.copy();
    }

    public Board getBoard() {
        return this.board;
    }
}
