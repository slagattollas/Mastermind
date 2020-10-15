package com.mastermindstefano.main.models;

import java.util.Collections;
import java.util.Random;

public class HiddenRow extends Code{
    HiddenRow(){
        super();
        for(int i=0; i<Pieces.length(); i++) {
            this.pieces.add(Pieces.get(i));
        }
        Random rn = new Random();
        for(int i=0; i<Pieces.length() - Goal.WIDTH; i++) {
            this.pieces.remove(rn.nextInt(Pieces.length()));
        }
        Collections.shuffle(this.pieces);
    }
    Goal getGoal(GuessRow guessRow){
        int blacks = 0;
        for (int i = 0; i < this.pieces.size(); i++) {
            if (guessRow.contains(this.pieces.get(i), i)) {
                blacks++;
            }
        }
        int whites = 0;
        for (int i = 0; i < this.pieces.size(); i++) {
            if (guessRow.contains(this.pieces.get(i))) {
                blacks++;
            }
        }
        return new Goal(blacks, whites);
    }
}
