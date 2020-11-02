package com.mastermindstefano.main.controllers.implementation;

import com.mastermindstefano.main.controllers.Logic;
import com.mastermindstefano.main.models.SessionImplementation;
import com.mastermindstefano.main.models.StateValue;

public class LogicImplementation extends Logic {
    protected StartControllerImplementation startControllerImplementation;
    protected PlayControllerImplementation playControllerImplementation;
    protected ResumeControllerImplementation resumeControllerImplementation;

    public LogicImplementation(){
        this.session = new SessionImplementation();

        this.startControllerImplementation = new StartControllerImplementation(this.session);
        this.playControllerImplementation = new PlayControllerImplementation(this.session);
        this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);

        this.acceptorControllerMap.put(StateValue.INITIAL, this.startControllerImplementation);
        this.acceptorControllerMap.put(StateValue.IN_GAME, this.playControllerImplementation);
        this.acceptorControllerMap.put(StateValue.RESUME, this.resumeControllerImplementation);
        this.acceptorControllerMap.put(StateValue.EXIT, null);
    }
}
