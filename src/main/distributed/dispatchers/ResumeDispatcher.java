package com.mastermindstefano.main.distributed.dispatchers;

import com.mastermindstefano.main.controllers.AcceptorController;
import com.mastermindstefano.main.controllers.ResumeController;

public class ResumeDispatcher extends Dispatcher {

    public ResumeDispatcher(AcceptorController acceptorController){
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        boolean isResumed = this.tcpip.receiveBoolean();
        ((ResumeController) this.acceptorController).resume(isResumed);
    }
}
