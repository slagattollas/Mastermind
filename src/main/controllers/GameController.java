package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.GuessRow;
import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.models.SessionImplementation;
import com.mastermindstefano.main.types.Error;

public class GameController extends Controller {
    private SessionImplementation sessionImplementation;
    public GameController(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) this.session;
    }
    public boolean isFinished(){
        return this.sessionImplementation.isFinished();
    }
    public int getAttempts(){
        return this.sessionImplementation.getAttempts();
    }
    public String getGuessRow(int index){
        return this.sessionImplementation.getGuessRow(index);
    }
    public String getGoal(int index){
        return this.sessionImplementation.getGoal(index);
    }
    public void addGuessRow(GuessRow guessRow){
        this.sessionImplementation.addGuessRow(guessRow);
    }
    public void registryMemento(){
        this.sessionImplementation.addRegistry();
    }
    public boolean isWinner(){
        return this.sessionImplementation.isWinner();
    }
    public Error validGuessRow(String string){
        return this.sessionImplementation.validGuessRow(string);
    }
    public void finished(){
        this.sessionImplementation.next();
    }
}
