package com.mastermindstefano.main.controllers.implementation;

import com.mastermindstefano.main.controllers.ResumeController;
import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {
    private SessionImplementation sessionImplementation;
    public ResumeControllerImplementation(Session session){
        super(session);
        this.sessionImplementation = ((SessionImplementation) this.session);
    }

    @Override
    public void resume(boolean isResumed) {
        if(isResumed){
            this.sessionImplementation.next();
        }else{
            this.sessionImplementation.reset();
        }
    }
}
