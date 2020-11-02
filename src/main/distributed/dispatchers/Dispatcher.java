package com.mastermindstefano.main.distributed.dispatchers;

import com.mastermindstefano.main.controllers.AcceptorController;

public abstract class Dispatcher {
    protected AcceptorController acceptorController;
    protected TCPIP tcpip;
    public Dispatcher(AcceptorController acceptorController){
        this.acceptorController = acceptorController;
    }
    public abstract void dispatch();

    public void associate(TCPIP tcpip){
        this.tcpip = tcpip;
    }
}
