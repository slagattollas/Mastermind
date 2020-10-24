package com.mastermindstefano.main.views;

import com.mastermindstefano.utils.Print;

public enum Message {
    GAME_TITLE("WELCOME TO MASTERMIND"),
    NUMBER_ATTEMPTS("#attempts attempt(s): "),
    RESULT(" --> #blacks blacks and #whites whites"),
    GUESS_ROW("INSERT GUESS COMBINATION"),
    RETRY("WANT TO PLAY AGAIN?"),
    ACTION_COMMAND("Do a action"),
    UNDO_COMMAND("Undo previous action"),
    REDO_COMMAND("Redo previous action");

    private String message;

    Message(String message){
        this.message = message;
    }

    public void writeln(){
        Print.instance().writeln(this.message);
    }
    public void writeln(int attempts) {
        assert this == Message.NUMBER_ATTEMPTS;
        Print.instance().writeln(this.message.replaceAll("#attempts", "" + attempts));
        Print.instance().writeln(attempts);
    }
    public void writeln(int blacks, int whites){
        assert this == Message.RESULT;
        Print.instance().writeln(this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
    }
    public String getMessage() {
        return this.message;
    }
}
