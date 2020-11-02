package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.views.ResumeView;

public class ResumeController extends Controller {
    public ResumeController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        this.resume(new ResumeView().read());
    }

    private void resume(boolean isResumed){
        if(isResumed){
            this.session.newGame();
        }else{
            this.session.next();
        }
    }

}
