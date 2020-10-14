package com.mastermindstefano.main;

import java.util.ArrayList;
import java.util.List;

abstract class Code {
    protected List<Pieces> pieces;

    protected Code (){
        this.pieces = new ArrayList<Pieces>();
    }
}
