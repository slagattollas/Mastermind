package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.StartController;
import com.mastermindstefano.main.views.Message;

public class StartGameView {
    public void interact(StartController startController){
        Message.GAME_TITLE.writeln();
        startController.next();
    }
}
