package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.views.GameView;
import com.mastermindstefano.utils.Print;

public class GameController extends Controller {

    public GameController(Session session){
        super(session);
    }
    @Override
    public void control() {
        GameView gameView = new GameView();
        int attempt = this.session.getAttempts();
        gameView.writeAttempts(attempt);
        for (int i = 0; i < attempt; i++){
            gameView.writeln(this.session.getGuessRow(i));
            gameView.writeln(this.session.getGoal(i));
        }
    }
}
