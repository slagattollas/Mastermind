package com.mastermindstefano.main.views.console;


import com.mastermindstefano.main.controllers.PlayController;

public class GameIniView{
    private BoardView boardView;
    private GuessRowView guessRowView;
    private PlayController playController;
    public GameIniView(PlayController playController){
        this.playController = playController;
        this.boardView = new BoardView(playController);
        this.guessRowView = new GuessRowView(playController);
    }
    public void interact(){
        this.boardView.interact();
        do {
            this.guessRowView.read();
            this.boardView.interact();
        }while(!this.playController.isFinished());
    }

}
