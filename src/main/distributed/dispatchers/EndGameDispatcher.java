package com.mastermindstefano.main.distributed.dispatchers;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.PlayController;

public class EndGameDispatcher extends Dispatcher {

    public EndGameDispatcher(AcceptorController acceptorController){
        super(acceptorController);
    }


    @Override
    public void dispatch() {
        ((PlayController) this.acceptorController).finished();
    }
}
