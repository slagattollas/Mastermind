package com.mastermindstefano.main.views;

import com.mastermindstefano.main.controllers.*;
import com.mastermindstefano.utils.Print;

public class View implements ControllerVisitor {
    private GameIniView gameIniView;
    private StartGameView startGameView;
    private ResumeView resumeView;
    public View(){
        this.gameIniView = new GameIniView();
        this.startGameView = new StartGameView();
        this.resumeView = new ResumeView();
    }

    public void interact(AcceptorController acceptorController){
        acceptorController.accept(this);
    }
    @Override
    public void visit(StartController startController) {
        this.startGameView.interact(startController);
    }

    @Override
    public void visit(PlayController playController) {
        this.gameIniView.interact(playController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }

}
