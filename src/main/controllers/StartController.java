package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.views.StartGameView;

public class StartController extends Controller {
    public StartController(Session session) {
        super(session);
    }
    @Override
    public void control() {
        this.session.next();
        new StartGameView().writeln();
    }

}
