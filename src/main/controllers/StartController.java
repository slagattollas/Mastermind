package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;

public class StartController extends Controller implements AcceptorController {
    public StartController(Session session) {
        super(session);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
    public void next(){
        this.session.reset();
        this.session.next();
    }

}
