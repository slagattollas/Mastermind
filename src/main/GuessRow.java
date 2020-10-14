package com.mastermindstefano.main;

import com.mastermindstefano.utils.Print;

import java.util.ArrayList;

class GuessRow extends Code {


    void print(){
        for (Pieces pieces : this.pieces) {
            pieces.write();
        }
    }
    void read(){
        Error error;
        do{
            Message.GUESS_ROW.writeln();
            error = errorGuess(Print.instance().readString());
            error.writeln();
            if(!error.isNull()){
                this.pieces = new ArrayList<Pieces>();
            }
        }while(!error.isNull());
    }
    private Error errorGuess(String guess){
        if(guess.length() != Goal.WIDTH){
            return Error.WRONG_PIECE_LENGTH;
        }
        for (int i = 0; i < guess.length(); i++) {
            Pieces piece = Pieces.getInstance(guess.charAt(i));
            if(piece.isNull()){
                return Error.WRONG_PIECE_TYPE;
            }
            for (int j = 0; j < i; j++) {
                if(this.pieces.get(j) == piece){
                    return Error.DUPLICATE_PIECE;
                }
            }
            this.pieces.add(piece);
        }
        return Error.NULL_ERROR;
    }
    boolean contains(Pieces pieces, int position) {
        return this.pieces.get(position) == pieces;
    }
    boolean contains(Pieces pieces) {
        for (int i = 0; i < this.pieces.size(); i++) {
            if(this.pieces.get(i) == pieces) {
                return true;
            }
        }
        return false;
    }
}
