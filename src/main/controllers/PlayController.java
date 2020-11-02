package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.types.Error;

public abstract class PlayController extends AcceptorController {
    public PlayController(Session session) {
        super(session);
    }
    public abstract  boolean isFinished();
    public abstract int getAttempts();
    public abstract String getGuessRow(int index);
    public abstract String getGoal(int index);
    public abstract boolean undoable();
    public abstract boolean redoable();
    public abstract void registryMemento();
    public abstract void redo();
    public abstract void undo();
    public abstract boolean isWinner();
    public abstract void finished();
    public abstract Error validGuessRow(String string);
    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
