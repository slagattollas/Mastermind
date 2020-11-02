package com.mastermindstefano.main.distributed;

import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.distributed.dispatchers.FrameType;
import com.mastermindstefano.main.distributed.dispatchers.TCPIP;
import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.types.Error;
import com.mastermindstefano.main.views.ErrorView;

public class PlayControllerProxy extends PlayController {
    private TCPIP tcpip;

    PlayControllerProxy(Session session, TCPIP tcpip){
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public boolean isFinished() {
        this.tcpip.send(FrameType.IS_FINISHED.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public int getAttempts() {
        this.tcpip.send(FrameType.GET_ATTEMPTS.name());
        return this.tcpip.receiveInt();
    }

    @Override
    public String getGuessRow(int index) {
        this.tcpip.send(FrameType.GET_GUESSROW.name());
        this.tcpip.send(index);
        return this.tcpip.receiveLine();
    }

    @Override
    public String getGoal(int index) {
        this.tcpip.send(FrameType.GET_GOAL.name());
        this.tcpip.send(index);
        return this.tcpip.receiveLine();
    }

    @Override
    public Error validGuessRow(String string) {
        this.tcpip.send(FrameType.VALID_GUESSROW.name());
        return this.tcpip.receiveError();
    }

    @Override
    public boolean undoable() {
        this.tcpip.send(FrameType.UNDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public boolean redoable() {
        this.tcpip.send(FrameType.REDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public void registryMemento() {
        this.tcpip.send(FrameType.REGISTER.name());
    }

    @Override
    public void redo() {
        this.tcpip.send(FrameType.REDO.name());
    }

    @Override
    public void undo() {
        this.tcpip.send(FrameType.UNDO.name());
    }

    @Override
    public boolean isWinner() {
        this.tcpip.send(FrameType.IS_WINNER.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public void finished() {
        this.tcpip.send(FrameType.FINISHED.name());
    }


}
