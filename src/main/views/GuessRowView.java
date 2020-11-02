package com.mastermindstefano.main.views;


import com.mastermindstefano.utils.Print;


public class GuessRowView{
    public String read(){
        Print.instance().writeln("Chose your combination");
        Print.instance().writeln();
        return Print.instance().readString();
    }
}
