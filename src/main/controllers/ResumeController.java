package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;

public class ResumeController extends Controller implements AcceptorController {
    public ResumeController(Session session) {
        super(session);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public void resume(boolean isResumed){
        if(isResumed){
            this.session.next();
        }else{
            this.session.reset();
        }
    }
}
