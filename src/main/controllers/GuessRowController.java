package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;
import com.mastermindstefano.main.views.ErrorView;
import com.mastermindstefano.main.views.GuessRowView;
import com.mastermindstefano.main.types.Error;

public class GuessRowController extends Controller {

    public GuessRowController(Session session){
        super(session);
    }

    @Override
    public void control() {
        Error error;
        do {
            String readString = new GuessRowView().read();
            error = this.session.validGuessRow(readString);
            if(error != null){
                new ErrorView(error).writeln();
            }
        }while(error != null);
    }
}
