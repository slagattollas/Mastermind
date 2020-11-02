package com.mastermindstefano.main.views;

import com.mastermindstefano.main.controllers.PlayController;

public class UndoCommand extends Command {
    private GameView gameView;
    UndoCommand(PlayController playController) {
        super(Message.UNDO_COMMAND.getMessage(), playController);
        this.gameView = new GameView();
    }

    @Override
    protected void execute() {
        this.playController.undo();
        this.gameView.interact(playController);
    }

    @Override
    protected boolean isActive() {
        return this.playController.undoable();
    }
}
