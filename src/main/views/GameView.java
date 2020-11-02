package com.mastermindstefano.main.views;

import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.views.Message;
import com.mastermindstefano.utils.Print;

public class GameView {
    public void interact(PlayController playController){
        Print.instance().writeln();
        int attempt = playController.getAttempts();
        Message.NUMBER_ATTEMPTS.writeln(attempt);
        for (int i = 0; i < attempt; i++){
            Print.instance().writeln(playController.getGuessRow(i));
            Print.instance().writeln(playController.getGoal(i));
        }
    }
}
