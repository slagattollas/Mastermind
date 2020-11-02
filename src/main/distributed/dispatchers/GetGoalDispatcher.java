package com.mastermindstefano.main.distributed.dispatchers;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.PlayController;

public class GetGoalDispatcher extends Dispatcher {
    public GetGoalDispatcher(AcceptorController acceptorController){
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        int index = this.tcpip.receiveInt();
        this.tcpip.send(((PlayController) this.acceptorController).getGoal(index));
    }
}
