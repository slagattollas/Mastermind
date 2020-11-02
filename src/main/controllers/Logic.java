package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {
    protected Session session;
    protected Map<StateValue, AcceptorController> acceptorControllerMap;

    protected Logic() {
        this.acceptorControllerMap = new HashMap<StateValue, AcceptorController>();
    }
    public AcceptorController getController(){
        return this.acceptorControllerMap.get(this.session.getValueState());
    }
}
