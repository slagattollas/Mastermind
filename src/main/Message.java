package com.mastermindstefano.main;

import com.mastermindstefano.utils.Print;

enum Message {
    GAME_TITLE("WELCOME TO MASTERMIND"),
    NUMBER_ATTEMPTS("#attempts attempt(s): "),
    RESULT(" --> #blacks blacks and #whites whites"),
    GUESS_ROW("INSERT GUESS COMBINATION"),
    RETRY("WANT TO PLAY AGAIN?");

    private String message;

    Message(String message){
        this.message = message;
    }

    void writeln(){
        Print.instance().writeln(this.message);
    }
    void writeln(int attempts) {
        assert this == Message.NUMBER_ATTEMPTS;
        Print.instance().writeln(this.message.replaceAll("#attempts", "" + attempts));
        Print.instance().writeln(attempts);
    }
    void writeln(int blacks, int whites){
        assert this == Message.RESULT;
        Print.instance().writeln(this.message.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
    }
}
