package com.mastermindstefano.main;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.Logic;
import com.mastermindstefano.main.views.View;

public abstract class Mastermind {
    private View view;
    private Logic logic;
    protected Mastermind(){
        this.logic = this.createLogic();
        this.view = new View();
    }
    protected abstract Logic createLogic();
    protected void play(){
        AcceptorController controller;
        do {
            controller = this.logic.getController();
            if(controller != null) {
                this.view.interact(controller);
            }
        }while(controller != null);
    }
}
