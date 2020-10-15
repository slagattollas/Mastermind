package com.mastermindstefano.main.views;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.models.GuessRow;

public class GameIniView {
    private Board board;
    private BoardView boardView;
    private GuessRowView guessRowView;
    public GameIniView(Board board){
        this.board = board;
        this.boardView = new BoardView(this.board);
        this.guessRowView = new GuessRowView(this.board);
    }
    public void interact(){
        Message.GAME_TITLE.writeln();
        this.boardView.interact();
        do {
            this.guessRowView.read();
            this.boardView.interact();
        }while(!this.board.isFinished());
    }
}
