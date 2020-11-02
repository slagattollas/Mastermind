package com.mastermindstefano.main.models;

import com.mastermindstefano.utils.Print;

import java.util.List;

public class GuessRow extends Code {
    public static final int WIDTH = 4;
    public GuessRow(){
        super();
    }
    public Pieces getPieces(int index) {
        return this.pieces.get(index);
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
    public String getRowString(){
        String str = "";
        for (int i = 0; i < this.pieces.size(); i++) {
            str += this.pieces.get(i).toString()+"  ";
        }
        return str;
    }
    public void addPiece(Pieces piece){
        this.pieces.add(piece);
    }
}
