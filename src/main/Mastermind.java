package com.mastermindstefano.main;

import com.mastermindstefano.main.controllers.Controller;
import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.controllers.ResumeController;
import com.mastermindstefano.main.controllers.StartController;
import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.models.StateValue;

import java.util.HashMap;

public class Mastermind {
    private Session session;
    private HashMap<StateValue, Controller> controllers;
    protected Mastermind(){
        this.session = new Session();
        this.controllers = new HashMap<StateValue, Controller>();
        this.controllers.put(StateValue.INITIAL, new StartController(this.session));
        this.controllers.put(StateValue.IN_GAME, new PlayController(this.session));
        this.controllers.put(StateValue.RESUME, new ResumeController(this.session));
        this.controllers.put(StateValue.EXIT, null);
    }
    protected void play(){
        Controller controller;
        do {
            controller = this.controllers.get(this.session.getValueState());
            if(controller != null) {
                controller.control();
            }
        }while(controller != null);
    }
    public static void main(String[] args) {
        new Mastermind().play();
    }
}


