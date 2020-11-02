package com.mastermindstefano.main.distributed;

import com.mastermindstefano.main.controllers.Logic;
import com.mastermindstefano.main.distributed.dispatchers.TCPIP;
import com.mastermindstefano.main.models.StateValue;

public class LogicProxy extends Logic {
    private TCPIP tcpip;
    public LogicProxy(){
        this.tcpip = TCPIP.createClientSocket();
        this.session = new SessionProxy(this.tcpip);
        this.acceptorControllerMap.put(StateValue.INITIAL, new StartControllerProxy(this.session, this.tcpip));
        this.acceptorControllerMap.put(StateValue.IN_GAME, new PlayControllerProxy(this.session,this.tcpip));
        this.acceptorControllerMap.put(StateValue.RESUME, new ResumeControllerProxy(this.session,this.tcpip));
        this.acceptorControllerMap.put(StateValue.EXIT, null);
    }
    public void close() {
        this.tcpip.close();
    }
}
