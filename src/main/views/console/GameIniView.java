package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.views.Message;

public class GameIniView extends SubView {
    private BoardView boardView;
    private GuessRowView guessRowView;
    public GameIniView(Board board){
        super(board);
        this.boardView = new BoardView(this.board);
        this.guessRowView = new GuessRowView(this.board);
    }
    public void interact(){
        this.boardView.interact();
        do {
            this.guessRowView.read();
            this.boardView.interact();
        }while(!this.board.isFinished());
    }

}
