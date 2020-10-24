package com.mastermindstefano.main.models;

public enum Pieces {
        RED('r'),
        BLUE('b'),
        YELLOW('y'),
        GREEN('g'),
        ORANGE('o'),
        PURPLE('p'),
        NULL_PIECES;

        private char initial;

        private Pieces() {
        }
        private Pieces(char initial) {
            this.initial = initial;
        }
        static int length(){
            return Pieces.values().length - 1;
        }
        static Pieces get(int index){
            return Pieces.values()[index];
        }
        public boolean isNull(){
            return this == Pieces.NULL_PIECES;
        }

}
