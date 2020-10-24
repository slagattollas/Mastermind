package com.mastermindstefano.main.models;

public class GameMemento {
    private Board board;

    GameMemento(Board board){
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }
}
