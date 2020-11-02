package com.mastermindstefano.main.models;

public class GameMemento {
    private Game game;

    GameMemento(Game game){
        this.game = game.copy();
    }

    public Game getBoard() {
        return this.game;
    }
}
