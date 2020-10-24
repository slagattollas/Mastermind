package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.views.Message;

public class RedoCommand extends Command {
    private BoardView boardView;
    RedoCommand(PlayController playController){
        super(Message.REDO_COMMAND.getMessage(), playController);
        this.boardView = new BoardView();
    }

    @Override
    protected void execute() {
        this.playController.redo();
        this.boardView.interact(playController);
    }

    @Override
    protected boolean isActive() {
        return this.playController.redoable();
    }
}
