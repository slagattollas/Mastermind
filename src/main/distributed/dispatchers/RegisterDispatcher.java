package com.mastermindstefano.main.distributed.dispatchers;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.PlayController;

public class RegisterDispatcher extends Dispatcher{

    public RegisterDispatcher(AcceptorController acceptorController){
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        ((PlayController) this.acceptorController).registryMemento();
    }
}
