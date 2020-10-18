package com.mastermindstefano.main;

import com.mastermindstefano.main.controllers.Controller;
import com.mastermindstefano.main.controllers.Logic;
import com.mastermindstefano.main.views.View;

public abstract class Mastermind {
    private View view;
    private Logic logic;
    protected Mastermind(){
        this.logic = new Logic();
        this.view = this.createView();
    }
    protected abstract View createView();
    protected void play(){
        Controller controller;
        do {
            controller = this.logic.getController();
            if(controller != null) {
                this.view.interact(controller);
            }
        }while(controller != null);
    }
}
