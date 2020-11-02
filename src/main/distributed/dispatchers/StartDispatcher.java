package com.mastermindstefano.main.distributed.dispatchers;

import com.mastermindstefano.main.controllers.StartController;

public class StartDispatcher extends Dispatcher {

    public StartDispatcher(StartController startController){
        super(startController);
    }

    @Override
    public void dispatch() {
        ((StartController) this.acceptorController).start();
    }
}
