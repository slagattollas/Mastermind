package com.mastermindstefano.main.views;

import com.mastermindstefano.main.controllers.PlayController;

public class RedoCommand extends Command {
    private GameView gameView;
    RedoCommand(PlayController playController){
        super(Message.REDO_COMMAND.getMessage(), playController);
        this.gameView = new GameView();
    }

    @Override
    protected void execute() {
        this.playController.redo();
        this.gameView.interact(playController);
    }

    @Override
    protected boolean isActive() {
        return this.playController.redoable();
    }
}
