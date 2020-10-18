package com.mastermindstefano.main.views.console;


import com.mastermindstefano.main.controllers.PlayController;

public class GameIniView{
    private BoardView boardView;
    private GuessRowView guessRowView;
    public GameIniView(){
        this.boardView = new BoardView();
        this.guessRowView = new GuessRowView();
    }
    public void interact(PlayController playController){
        playController.next();
        this.boardView.interact(playController);
        do {
            this.guessRowView.read(playController);
            this.boardView.interact(playController);
        }while(!playController.isFinished());
    }

}
