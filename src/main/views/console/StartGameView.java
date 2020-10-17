package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.views.Message;

public class StartGameView extends SubView {
    StartGameView(Board board){
        super(board);
    }
    public void interact(){
        Message.GAME_TITLE.writeln();
    }
}
