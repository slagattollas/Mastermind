package com.mastermindstefano.main.views;

import com.mastermindstefano.utils.Print;

public class GameView {
    public void writeAttempts(int attempts){
        Message.NUMBER_ATTEMPTS.writeln(attempts);
        Print.instance().writeln();
    }
    public void writeln(String string){
        Print.instance().writeln(string);
        Print.instance().writeln();
    }
}
