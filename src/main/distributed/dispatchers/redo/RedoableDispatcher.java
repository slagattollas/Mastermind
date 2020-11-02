package com.mastermindstefano.main.distributed.dispatchers.redo;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.distributed.dispatchers.Dispatcher;

public class RedoableDispatcher extends Dispatcher {

    public RedoableDispatcher(AcceptorController acceptorController){
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((PlayController) this.acceptorController).undoable());
    }
}
