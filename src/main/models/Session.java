package com.mastermindstefano.main.models;
import com.mastermindstefano.main.types.Error;
public class Session {

    private Game game;
    private State state;

    public Session(){
        this.game = new Game();
        this.state = new State();
    }
    public void next(){
        this.state.next();
    }
    public void newGame() {
        this.game.clear();
        this.state.reset();
    }
    public boolean isFinished(){
        return this.game.isFinished();
    }
    public StateValue getValueState() {
        return this.state.getValueState();
    }
    public int getAttempts(){
        return this.game.getAttempts();
    }
    public String getGuessRow(int index){
        return this.game.getGuessRow(index);
    }
    public String getGoal(int index){
        return this.game.getGoal(index);
    }
    public void addGuessRow(GuessRow guessRow){
        this.game.addGuessRow(guessRow);
    }
    public boolean isWinner(){
        return this.game.isWinner();
    }
    public Error validGuessRow(String guess){
        GuessRow guessRow = new GuessRow();
        if(guess.length() != guessRow.WIDTH){
            return Error.WRONG_PIECE_LENGTH;
        }

        for (int i = 0; i < guess.length(); i++) {
            Pieces piece = Pieces.getInstance(guess.charAt(i));
            if(piece.isNull()){
                return Error.WRONG_PIECE_TYPE;
            }
            for (int j = 0; j < i; j++) {
                if(guessRow.getPieces(j) == piece){
                    return Error.DUPLICATE_PIECE;
                }
            }
            guessRow.addPiece(piece);
        }
        this.addGuessRow(guessRow);
        return null;
    }

}
