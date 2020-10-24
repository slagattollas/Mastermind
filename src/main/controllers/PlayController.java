package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.GuessRow;
import com.mastermindstefano.main.models.Session;

public class PlayController extends Controller implements AcceptorController {
    private UndoController undoController;
    private RedoController redoController;
    public PlayController(Session session) {
        super(session);
        this.undoController = new UndoController(session);
        this.redoController = new RedoController(session);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public boolean isFinished(){
        return this.session.isFinished();
    }
    public int getAttempts(){
        return this.session.getAttempts();
    }
    public String getGuessRow(int index){
        return this.session.getGuessRow(index);
    }
    public String getGoal(int index){
        return this.session.getGoal(index);
    }
    public void addGuessRow(GuessRow guessRow){
        this.session.addGuessRow(guessRow);
    }
    public boolean undoable() {
        return this.undoController.undoable();
    }
    public boolean redoable() {
        return this.redoController.redoable();
    }
    public void registryMemento(){
        this.session.addRegistry();
    }
    public void redo(){
        this.redoController.redo();
    }
    public void undo(){
        this.undoController.undo();
    }
    public boolean isWinner(){
        return this.session.isWinner();
    }
    public void finished(){
        this.session.next();
    }

}
