package com.mastermindstefano.main.views;

import com.mastermindstefano.main.models.Pieces;

public class PiecesView {
    private static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};
    private Pieces pieces;

    public static String allInitials() {
        String result = "";
        for(char character: PiecesView.INITIALS) {
            result += character;
        }
        return result;
    }

}
