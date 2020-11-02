package com.mastermindstefano.main.distributed.dispatchers.undo;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.distributed.dispatchers.Dispatcher;

public class UndoDispatcher extends Dispatcher {

    public UndoDispatcher(AcceptorController acceptorController){
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        ((PlayController) this.acceptorController).undo();
    }
}
