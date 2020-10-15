package com.mastermindstefano.main.models;

public class Goal {
    public static final int WIDTH = 4;

    private int whites = 0;
    private int blacks = 0;
    Goal(int blacks, int whites){
        this.whites = whites;
        this.blacks = blacks;
    }
    public boolean guessed(){
        return this.blacks == Goal.WIDTH;
    }
}
