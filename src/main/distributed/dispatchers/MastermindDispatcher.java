package com.mastermindstefano.main.distributed.dispatchers;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.PlayController;

public class MastermindDispatcher extends Dispatcher {

    public MastermindDispatcher(AcceptorController acceptorController){
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((PlayController) this.acceptorController).isFinished());

    }
}
