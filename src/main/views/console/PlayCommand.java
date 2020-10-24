package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.views.Message;
import com.mastermindstefano.utils.Print;

class PlayCommand extends Command {
    private BoardView boardView;
    private GuessRowView guessRowView;
    PlayCommand(PlayController playController) {
        super(Message.ACTION_COMMAND.getMessage(), playController);
        this.boardView = new BoardView();
        this.guessRowView = new GuessRowView();
    }

    @Override
    protected void execute() {
        this.boardView.interact(playController);
        this.guessRowView.read(playController);
        this.playController.registryMemento();
        if(playController.isFinished()){
            if(playController.isWinner()){
                Print.instance().writeln("You won!");
            }else{
                Print.instance().writeln("You lost!");
            }
            this.playController.finished();
        }
    }

    @Override
    protected boolean isActive() {
        return false;
    }
}
