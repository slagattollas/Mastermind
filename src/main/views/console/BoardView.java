package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.Logic;
import com.mastermindstefano.main.views.Message;
import com.mastermindstefano.utils.Print;

public class BoardView{
    private Logic logic;
    public BoardView(Logic logic) {
        this.logic = logic;
    }
    public void interact(){
        Print.instance().writeln();
        int attempt = this.logic.getAttempts();
        Message.NUMBER_ATTEMPTS.writeln(attempt);
        for (int i = 0; i < attempt; i++){
            Print.instance().writeln(this.logic.getGuessRow(i));
            Print.instance().writeln(this.logic.getGoal(i));
        }
    }
}
