package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.views.Message;
import com.mastermindstefano.utils.Print;

public class BoardView{
    private PlayController playController;
    public BoardView(PlayController playController) {
        this.playController = playController;
    }
    public void interact(){
        Print.instance().writeln();
        int attempt = this.playController.getAttempts();
        Message.NUMBER_ATTEMPTS.writeln(attempt);
        for (int i = 0; i < attempt; i++){
            Print.instance().writeln(this.playController.getGuessRow(i));
            Print.instance().writeln(this.playController.getGoal(i));
        }
    }
}
