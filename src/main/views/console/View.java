package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.*;

public class View extends com.mastermindstefano.main.views.View {
    private GameIniView gameIniView;
    private StartGameView startGameView;
    private ResumeView resumeView;
    public View(){
        this.gameIniView = new GameIniView();
        this.startGameView = new StartGameView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void interact(Controller controller){
        if(controller instanceof StartController){
            this.startGameView.interact((StartController) controller);
        }else{
            if(controller instanceof PlayController){
                this.gameIniView.interact((PlayController) controller);
            }else{
                this.resumeView.interact((ResumeController) controller);
            }
        }
    }
}
