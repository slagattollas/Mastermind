package com.mastermindstefano.main.distributed.dispatchers.undo;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.distributed.dispatchers.Dispatcher;

public class UndoableDispatcher extends Dispatcher {

    public UndoableDispatcher(AcceptorController acceptorController){
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((PlayController) this.acceptorController).undoable());
    }
}
