package com.mastermindstefano.main.distributed.dispatchers;

public enum FrameType {
    START,
    STATE,
    UNDO,
    REDO,
    NEW_GAME,
    GET_ATTEMPTS,
    GET_GUESSROW,
    GET_GOAL,
    REGISTER,
    VALID_GUESSROW,
    IS_FINISHED,
    IS_WINNER,
    FINISHED,
    UNDOABLE,
    REDOABLE,
    CLOSE;
    public static FrameType parser(String string) {
        for(FrameType frameType : FrameType.values()) {
            if (frameType.name().equals(string)) {
                return frameType;
            }
        }
        return null;
    }
}
