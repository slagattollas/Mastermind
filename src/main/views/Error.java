package com.mastermindstefano.main.views;

import com.mastermindstefano.main.views.console.PiecesView;
import com.mastermindstefano.utils.Print;

public enum Error {
    WRONG_PIECE_TYPE("Wrong color, pick of these: "+ PiecesView.allInitials()),
    WRONG_PIECE_LENGTH("String must be exactly 4 characters, 4 slots"),
    DUPLICATE_PIECE("You cant duplicate colors"),
    NULL_ERROR;
    private String errMessage = "";
    private Error(){
    }
    private Error(String error){
        this.errMessage = error;
    }
    public void writeln(){
        Print.instance().writeln(this.errMessage);
    }
    public boolean isNull(){
        return this == Error.NULL_ERROR;
    }
}
