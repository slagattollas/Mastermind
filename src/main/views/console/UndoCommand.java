package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.views.Message;

public class UndoCommand extends Command {
    private BoardView boardView;
    UndoCommand(PlayController playController) {
        super(Message.UNDO_COMMAND.getMessage(), playController);
        this.boardView = new BoardView();
    }

    @Override
    protected void execute() {
        this.playController.undo();
        this.boardView.interact(playController);
    }

    @Override
    protected boolean isActive() {
        return this.playController.undoable();
    }
}
