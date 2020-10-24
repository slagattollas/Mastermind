package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.PlayController;

abstract class Command extends com.mastermindstefano.utils.Command {

    protected PlayController playController;

    protected Command(String title, PlayController playController) {
        super(title);
        this.playController = playController;
    }

}
