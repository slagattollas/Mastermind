package com.mastermindstefano.main.views;

import com.mastermindstefano.utils.Print;

public class ResultView {
    public void printWinner(){
        Print.instance().writeln("You won");
    }
    public void printLooser(){
        Print.instance().writeln("You lost");
    }
}
