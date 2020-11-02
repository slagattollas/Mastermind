package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.models.StateValue;

public abstract class Controller {
    protected Session session;
    Controller(Session session){
        this.session = session;
    }
    public StateValue getValueState(){
        return this.session.getValueState();
    }
}
