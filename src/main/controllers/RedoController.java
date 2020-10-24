package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;

public class RedoController extends Controller {
    RedoController(Session session){
        super(session);
    }
    public void redo(){
        this.session.redo();
    }
    boolean redoable(){
        return this.session.redoable();
    }
}
