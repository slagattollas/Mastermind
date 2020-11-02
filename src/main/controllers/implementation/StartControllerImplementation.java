package com.mastermindstefano.main.controllers.implementation;

import com.mastermindstefano.main.controllers.StartController;
import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.models.SessionImplementation;

public class StartControllerImplementation extends StartController {
    SessionImplementation sessionImplementation;
    public StartControllerImplementation(Session session) {
        super(session);
        this.sessionImplementation = ((SessionImplementation) this.session);
    }
    @Override
    public void start() {
        this.sessionImplementation.next();
    }
}
