package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.models.State;
import com.mastermindstefano.main.models.StateValue;

import javax.naming.ldap.Control;
import java.util.HashMap;
import java.util.Map;

public class Logic {
    private Board board;
    private State state;
    private Map<StateValue, Control> controllers;

    public Logic() {
        this.state = new State();
        this.board = new Board();
        this.controllers = new HashMap<StateValue, Control>();
        this.controllers.put(StateValue.INITIAL, (Control) new StartController(this.board, this.state));
        this.controllers.put(StateValue.IN_GAME, (Control) new PlayController(this.board, this.state));
        this.controllers.put(StateValue.RESUME, (Control) new ResumeController(this.board, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }
    public Controller getController(){
        return (Controller) this.controllers.get(this.state.getValueState());
    }
}
