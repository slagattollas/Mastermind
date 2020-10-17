package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.models.Board;

public class SubView {
    protected Board board;
    SubView(Board board){
        assert board != null;
        this.board = board;
    }
}
