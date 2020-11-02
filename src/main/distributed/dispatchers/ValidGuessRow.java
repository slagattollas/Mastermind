package com.mastermindstefano.main.distributed.dispatchers;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.PlayController;

public class ValidGuessRow extends Dispatcher {

    public ValidGuessRow(AcceptorController acceptorController){
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        String string = this.tcpip.receiveLine();
        this.tcpip.send(((PlayController) this.acceptorController).validGuessRow(string));
    }
}
