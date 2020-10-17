package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.controllers.ResumeController;

public class View extends com.mastermindstefano.main.views.View {
    private GameIniView gameIniView;
    private StartGameView startGameView;
    private ResumeView resumeView;
    public View(PlayController playController, ResumeController resumeController){
        this.gameIniView = new GameIniView(playController);
        this.startGameView = new StartGameView();
        this.resumeView = new ResumeView(resumeController);
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
