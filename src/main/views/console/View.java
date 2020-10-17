package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.views.Message;

public class View extends com.mastermindstefano.main.views.View {
    private GameIniView gameIniView;
    private StartGameView startGameView;
    private ResumeView resumeView;
    public View(Board board){
        super(board);
        this.gameIniView = new GameIniView(board);
        this.startGameView = new StartGameView(board);
        this.resumeView = new ResumeView(board);
    }

    @Override
    protected void start() {
        this.startGameView.interact();
    }

    @Override
    protected void play() {
        do {
            this.gameIniView.interact();
        }while(this.isResumed());

    }
    @Override
    protected boolean isResumed() {
        return this.resumeView.interact();
    }
}
