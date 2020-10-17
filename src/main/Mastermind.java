package com.mastermindstefano.main;

import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.controllers.ResumeController;
import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.views.View;

public abstract class Mastermind {
    private Board board;
    private View view;
    private PlayController playController;
    private ResumeController resumeController;
    protected Mastermind(){
        this.board = new Board();
        this.playController = new PlayController(this.board);
        this.resumeController = new ResumeController(this.board);
        this.view = this.createView(this.playController, this.resumeController);
    }
    protected abstract View createView(PlayController playController, ResumeController resumeController);
    protected void play(){
        this.view.interact();
    }
}
