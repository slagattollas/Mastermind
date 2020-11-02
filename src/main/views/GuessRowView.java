package com.mastermindstefano.main.views;


import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.types.Error;
import com.mastermindstefano.utils.Print;


public class GuessRowView{
    void read(PlayController playController){
        Error error;
        do{
            Print.instance().writeln();
            Message.GUESS_ROW.writeln();
            String guess = Print.instance().readString();
            error = playController.validGuessRow(guess);
            if(error != null){
                new ErrorView(error).writeln();
            }
        }while(error != null);
    }
}
