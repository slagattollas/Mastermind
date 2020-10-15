package com.mastermindstefano.main.views;


import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.models.Goal;
import com.mastermindstefano.main.models.GuessRow;
import com.mastermindstefano.main.models.Pieces;
import com.mastermindstefano.utils.Print;

public class GuessRowView {
    private Board board;
    public GuessRowView(Board board){
        this.board = board;
    }
    void read(){
        Error error;
        GuessRow guessRow = new GuessRow();
        do{
            String guess = Print.instance().readString();
            Message.GUESS_ROW.writeln();
            if(guess.length() != Goal.WIDTH){
                Error.WRONG_PIECE_LENGTH.writeln();
                error = Error.WRONG_PIECE_LENGTH;
            }
            for (int i = 0; i < guess.length(); i++) {
                Pieces piece = Pieces.getInstance(guess.charAt(i));
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
        this.board.addGuessRow(guessRow);
    }
}
