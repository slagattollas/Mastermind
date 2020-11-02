package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.models.SessionImplementation;

public class RedoController extends Controller {
    private SessionImplementation sessionImplementation;
    public RedoController(Session session){
        super(session);
        this.sessionImplementation = (SessionImplementation) this.session;
    }
    public void redo(){
        this.sessionImplementation.redo();
    }
    public boolean redoable(){
        return this.sessionImplementation.redoable();
    }
}
