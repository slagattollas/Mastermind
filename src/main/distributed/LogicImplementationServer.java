package com.mastermindstefano.main.distributed;

import com.mastermindstefano.main.controllers.implementation.LogicImplementation;
import com.mastermindstefano.main.distributed.dispatchers.*;
import com.mastermindstefano.main.distributed.dispatchers.redo.RedoDispatcher;
import com.mastermindstefano.main.distributed.dispatchers.redo.RedoableDispatcher;
import com.mastermindstefano.main.distributed.dispatchers.undo.UndoDispatcher;
import com.mastermindstefano.main.distributed.dispatchers.undo.UndoableDispatcher;

public class LogicImplementationServer extends LogicImplementation {
    public void createDispatchers(DispatcherPrototype dispatcherPrototype){
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
        dispatcherPrototype.add(FrameType.GET_ATTEMPTS, new AttemptsDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.GET_GUESSROW, new GetGuessRowDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.GET_GOAL, new GetGoalDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.REGISTER, new RegisterDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.VALID_GUESSROW, new ValidGuessRow(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.IS_FINISHED, new MastermindDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.IS_WINNER, new ResultDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.FINISHED, new EndGameDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDO, new RedoDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeControllerImplementation));
    }
}
