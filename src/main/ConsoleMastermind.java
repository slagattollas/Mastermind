package com.mastermindstefano.main;

import com.mastermindstefano.main.controllers.Controller;
import com.mastermindstefano.main.controllers.Logic;
import com.mastermindstefano.main.views.console.View;

public class ConsoleMastermind extends Mastermind {

    @Override
    protected com.mastermindstefano.main.views.View createView() {
        return new View();
    }
    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
