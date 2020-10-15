package com.mastermindstefano.main.views;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.utils.Print;

public class BoardView {
    private Board board;
    public BoardView(Board board) {
        this.board = board;
    }
    public void interact(){
        Print.instance().writeln();
        int attempt = this.board.getAttempts();
        Message.NUMBER_ATTEMPTS.writeln(attempt);
        for (int i = 0; i < attempt; i++){
            Print.instance().writeln(this.board.getGuessRow(i));
            Print.instance().writeln(this.board.getGoal(i));
        }
    }

}
