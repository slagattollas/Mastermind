package com.mastermindstefano.main.distributed.dispatchers.redo;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.distributed.dispatchers.Dispatcher;

public class RedoDispatcher extends Dispatcher {

    public RedoDispatcher(AcceptorController acceptorController){
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        ((PlayController) this.acceptorController).redo();
    }
}