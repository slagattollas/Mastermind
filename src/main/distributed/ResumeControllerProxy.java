package com.mastermindstefano.main.distributed;

import com.mastermindstefano.main.controllers.ResumeController;
import com.mastermindstefano.main.distributed.dispatchers.FrameType;
import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.utils.TCPIP;

public class ResumeControllerProxy extends ResumeController {
    private TCPIP tcpip;
    public ResumeControllerProxy(Session session, TCPIP tcpip){
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void resume(boolean isResumed) {
        this.tcpip.send(FrameType.NEW_GAME.name());
        this.tcpip.send(isResumed);
    }
}
