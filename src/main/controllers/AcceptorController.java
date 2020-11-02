package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;

public abstract class AcceptorController extends Controller {

    AcceptorController(Session session){
        super(session);
    }
    public abstract void accept(ControllerVisitor controllerVisitor);

}
