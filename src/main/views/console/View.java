package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.Logic;

public class View extends com.mastermindstefano.main.views.View {
    private GameIniView gameIniView;
    private StartGameView startGameView;
    private ResumeView resumeView;
    public View(Logic logic){
        this.gameIniView = new GameIniView(logic);
        this.startGameView = new StartGameView();
        this.resumeView = new ResumeView(logic);
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
