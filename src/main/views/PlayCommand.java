package com.mastermindstefano.main.views;

import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.utils.Print;

class PlayCommand extends Command {
    private GameView gameView;
    private GuessRowView guessRowView;
    PlayCommand(PlayController playController) {
        super(Message.ACTION_COMMAND.getMessage(), playController);
        this.gameView = new GameView();
        this.guessRowView = new GuessRowView();
    }

    @Override
    protected void execute() {
        this.gameView.interact(playController);
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
        return true;
    }
}
