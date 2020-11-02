package com.mastermindstefano.main;

import com.mastermindstefano.main.controllers.Logic;
import com.mastermindstefano.main.controllers.implementation.LogicImplementation;

public class MastermindStandalone extends Mastermind {

    public static void main(String[] args) {
        new MastermindStandalone().play();
    }

    @Override
    protected Logic createLogic() {
        return new LogicImplementation();
    }
}
