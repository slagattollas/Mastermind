package com.mastermindstefano.main.distributed;

import com.mastermindstefano.main.distributed.dispatchers.FrameType;
import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.models.StateValue;
import com.mastermindstefano.utils.TCPIP;

public class SessionProxy implements Session {
    private TCPIP tcpip;
    public SessionProxy (TCPIP tcpip){
        this.tcpip = tcpip;
    }
    public StateValue getValueState() {
        this.tcpip.send(FrameType.STATE.name());
        return StateValue.values()[this.tcpip.receiveInt()];
    }
}
