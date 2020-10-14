package com.mastermindstefano.main;

class Goal {
    public static final int WIDTH = 4;
    private int whites = 0;
    private int blacks = 0;
    Goal(int blacks, int whites){
        this.whites = whites;
        this.blacks = blacks;
    }
    void writeln(){
        Message.RESULT.writeln(this.blacks, this.whites);
    }
    public boolean guessed(){
        return this.blacks == Goal.WIDTH;
    }

}
