package com.mastermindstefano.main;

import com.mastermindstefano.utils.Print;

public class Mastermind {
    private Board board;

    public void play(){
        do {
            this.gameIni();
        }while (this.isGameResumed());

    }
    private void gameIni(){
        Message.GAME_TITLE.writeln();
        this.board = new Board();
        this.board.writeln();
        do {
            GuessRow guessRow = new GuessRow();
            guessRow.read();
            this.board.add(guessRow);
            this.board.writeln();
        }while(!this.board.isFinished());
    }
    private boolean isGameResumed(){
        return Print.instance().readResume(Message.RETRY.toString());
    }
    public static void main(String[] args) {
        new Mastermind().play();
    }
}
