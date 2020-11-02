package com.mastermindstefano.main.distributed.dispatchers;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.PlayController;

public class GetGuessRowDispatcher extends Dispatcher {

    public GetGuessRowDispatcher(AcceptorController acceptorController){
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        int index = this.tcpip.receiveInt();
        this.tcpip.send(((PlayController) this.acceptorController).getGuessRow(index));
    }
}
