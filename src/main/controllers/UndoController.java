package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.models.SessionImplementation;

public class UndoController extends Controller{
    private SessionImplementation sessionImplementation;
    public UndoController(Session session) {
        super(session);
        this.sessionImplementation = (SessionImplementation) this.session;
    }
    public void undo(){
        this.sessionImplementation.undo();
    }
    public boolean undoable(){
        return this.sessionImplementation.undoable();
    }
}
