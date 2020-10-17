package com.mastermindstefano.main;

import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.controllers.ResumeController;
import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.views.console.View;

public class ConsoleMastermind extends Mastermind {

    @Override
    protected com.mastermindstefano.main.views.View createView(PlayController playController, ResumeController resumeController) {
        return new View(playController,resumeController);
    }
    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
