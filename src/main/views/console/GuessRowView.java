package com.mastermindstefano.main.views.console;


import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.main.models.GuessRow;
import com.mastermindstefano.main.models.Pieces;
import com.mastermindstefano.main.views.Message;
import com.mastermindstefano.main.views.Error;
import com.mastermindstefano.utils.Print;


public class GuessRowView{
    void read(PlayController playController){
        Error error;
        GuessRow guessRow = new GuessRow();
        do{
            String guess = Print.instance().readString();
            Message.GUESS_ROW.writeln();
            if(guess.length() != guessRow.WIDTH){
                Error.WRONG_PIECE_LENGTH.writeln();
                error = Error.WRONG_PIECE_LENGTH;
            }
            for (int i = 0; i < guess.length(); i++) {
                Pieces piece = PiecesView.getInstance(guess.charAt(i));
                if(piece.isNull()){
                    Error.WRONG_PIECE_TYPE.writeln();
                    error = Error.WRONG_PIECE_TYPE;
                }
                for (int j = 0; j < i; j++) {
                    if(guessRow.getPieces(j) == piece){
                        Error.DUPLICATE_PIECE.writeln();
                        error = Error.DUPLICATE_PIECE;
                    }
                }
                guessRow.addPiece(piece);
            }
            error = Error.NULL_ERROR;
        }while(!error.isNull());
        playController.addGuessRow(guessRow);
    }
}
