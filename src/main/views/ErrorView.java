package com.mastermindstefano.main.views;

import com.mastermindstefano.utils.Print;
import com.mastermindstefano.main.types.Error;

public class ErrorView {
    public static final String[] MESSAGES = {
            "Wrong color, pick of these: "+ PiecesView.allInitials(),
            "String must be exactly 4 characters, 4 slots",
            "You cant duplicate colors"
    };
    protected Error error;

    public ErrorView(Error error){
        this.error = error;
    }
    public void writeln(){
        Print.instance().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
        Print.instance().writeln();
    }
}
