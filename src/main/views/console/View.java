package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.*;

public class View extends com.mastermindstefano.main.views.View implements ControllerVisitor {
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
        controller.accept(this);
    }
    @Override
    public void visit(StartController startController) {
        this.startGameView.interact(startController);
    }

    @Override
    public void visit(PlayController playController) {
        this.gameIniView.interact(playController);	}

    @Override
    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }
}
