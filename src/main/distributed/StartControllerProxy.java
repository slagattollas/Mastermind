package com.mastermindstefano.main.distributed;

import com.mastermindstefano.main.controllers.StartController;
import com.mastermindstefano.main.distributed.dispatchers.FrameType;
import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.utils.TCPIP;

public class StartControllerProxy extends StartController {
    private TCPIP tcpip;
    public StartControllerProxy(Session session, TCPIP tcpip){
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void start() {
        this.tcpip.send(FrameType.START.name());
    }
}
