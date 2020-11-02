package com.mastermindstefano.main.models;

import com.mastermindstefano.main.types.Error;
import com.mastermindstefano.main.views.ErrorView;
import com.mastermindstefano.utils.Print;

public class SessionImplementation implements Session {
    private Game game;
    private GameRegistry registry;
    private State state;
    public SessionImplementation() {
        this.state = new State();
        this.game = new Game();
        this.registry = new GameRegistry(this.game);
    }
    public boolean isFinished(){
        return this.game.isFinished();
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
    public boolean undoable(){
        return this.registry.undoable();
    }
    public boolean redoable() {
        return this.registry.redoable();
    }
    public void reset() {
        this.game.clear();
        this.registry.reset();
        this.state.reset();
    }
    public StateValue getValueState() {
        return this.state.getValueState();
    }
    public void next(){
        this.state.next();
    }
    public void addRegistry(){
        this.registry.registry();
    }
    public void undo(){
        this.registry.undo();
    }
    public void redo(){
        this.registry.redo();
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
