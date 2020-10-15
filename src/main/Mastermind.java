package com.mastermindstefano.main;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.views.GameIniView;
import com.mastermindstefano.main.views.ResumeView;

public class Mastermind {
    private Board board;
    private GameIniView gameIniView;
    private ResumeView resumeView;
    public Mastermind(){
        this.board = new Board();
        this.gameIniView = new GameIniView(this.board);
        this.resumeView = new ResumeView();
    }
    public void play(){
        do {
            this.gameIniView.interact();
        }while(this.resumeView.isGameResumed());
    }
        public static void main(String[] args) {
        new Mastermind().play();
    }
}
