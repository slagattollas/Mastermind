package com.mastermindstefano.main.views.console;


import com.mastermindstefano.main.controllers.Logic;

public class GameIniView{
    private BoardView boardView;
    private GuessRowView guessRowView;
    private Logic logic;
    public GameIniView(Logic logic){
        this.logic = logic;
        this.boardView = new BoardView(logic);
        this.guessRowView = new GuessRowView(logic);
    }
    public void interact(){
        this.boardView.interact();
        do {
            this.guessRowView.read();
            this.boardView.interact();
        }while(!this.logic.isFinished());
    }

}
