package com.mastermindstefano.main.controllers.implementation;

import com.mastermindstefano.main.controllers.*;
import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.types.Error;

public class PlayControllerImplementation extends PlayController {
    private UndoController undoController;
    private RedoController redoController;
    private GameController gameController;
    public PlayControllerImplementation(Session session){
        super(session);
        this.undoController = new UndoController(this.session);
        this.redoController = new RedoController(this.session);
        this.gameController = new GameController(this.session);
    }
    @Override
    public boolean isFinished() {
        return this.gameController.isFinished();
    }

    @Override
    public int getAttempts() {
        return this.gameController.getAttempts();
    }

    @Override
    public String getGuessRow(int index) {
        return this.gameController.getGuessRow(index);
    }

    @Override
    public String getGoal(int index) {
        return this.gameController.getGoal(index);
    }

    @Override
    public boolean undoable() {
        return this.undoController.undoable();
    }

    @Override
    public boolean redoable() {
        return this.redoController.redoable();
    }

    @Override
    public void registryMemento() {
        this.gameController.registryMemento();
    }

    @Override
    public void redo() {
        this.redoController.redo();
    }

    @Override
    public void undo() {
        this.undoController.undo();
    }

    @Override
    public boolean isWinner() {
        return this.gameController.isWinner();
    }

    @Override
    public void finished() {
        this.gameController.finished();
    }

    @Override
    public Error validGuessRow(String string) {
        return this.gameController.validGuessRow(string);
    }

}
