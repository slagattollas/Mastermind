package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.models.StateValue;

import javax.naming.ldap.Control;
import java.util.HashMap;
import java.util.Map;

public class Logic {
    private Session session;
    private Map<StateValue, Control> controllers;

    public Logic() {
        this.session = new Session();
        this.controllers = new HashMap<StateValue, Control>();
        this.controllers.put(StateValue.INITIAL, (Control) new StartController(this.session));
        this.controllers.put(StateValue.IN_GAME, (Control) new PlayController(this.session));
        this.controllers.put(StateValue.RESUME, (Control) new ResumeController(this.session));
        this.controllers.put(StateValue.EXIT, null);
    }
    public AcceptorController getController(){
        return (AcceptorController) this.controllers.get(this.session.getValueState());
    }
}
