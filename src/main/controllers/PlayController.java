package com.mastermindstefano.main.controllers;
import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.views.ResultView;

public class PlayController extends Controller {
    private GameController gameController;
    private GuessRowController guessRowController;
    public PlayController(Session session) {
        super(session);
        this.gameController = new GameController(session);
        this.guessRowController = new GuessRowController(session);
    }

    @Override
    public void control() {
        this.session.next();
        this.gameController.control();
        do {
            this.guessRowController.control();
            this.gameController.control();
        }while(!this.session.isFinished());
        if(this.session.isFinished()){
            if(this.session.isWinner()){
                new ResultView().printWinner();
            }else{
                new ResultView().printLooser();
            }
        }
    }
}
