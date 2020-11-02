package com.mastermindstefano.main.views;

import com.mastermindstefano.main.controllers.StartController;
import com.mastermindstefano.main.views.Message;
import com.mastermindstefano.utils.Print;

public class StartGameView {
    public void interact(StartController startController){
        startController.start();
        Message.GAME_TITLE.writeln();
    }
}
