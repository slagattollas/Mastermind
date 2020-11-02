package com.mastermindstefano.main.distributed.dispatchers;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.PlayController;

public class AttemptsDispatcher extends Dispatcher {

    public AttemptsDispatcher(AcceptorController acceptorController){
        super(acceptorController);
    }
    @Override
    public void dispatch() {
        this.tcpip.send(((PlayController) this.acceptorController).getAttempts());
    }
}
