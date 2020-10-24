package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;

public class UndoController extends Controller{
    UndoController(Session session) {
        super(session);
    }
    void undo(){
        this.session.undo();
    }
    boolean undoable(){
        return this.session.undoable();
    }
}
