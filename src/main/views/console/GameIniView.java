package com.mastermindstefano.main.views.console;


import com.mastermindstefano.main.controllers.PlayController;

public class GameIniView{
    public void interact(PlayController playController){
        new PlayMenu(playController).execute();
        /*playController.next();
        this.boardView.interact(playController);
        do {
            this.guessRowView.read(playController);
            this.boardView.interact(playController);
        }while(!playController.isFinished());*/
    }

}
