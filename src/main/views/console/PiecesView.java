package com.mastermindstefano.main.views.console;

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
    public static Pieces getInstance(char character) {
        for (int i = 0; i < PiecesView.INITIALS.length; i++) {
            if (PiecesView.INITIALS[i] == character) {
                return Pieces.values()[i];
            }
        }
        return null;
    }
}
