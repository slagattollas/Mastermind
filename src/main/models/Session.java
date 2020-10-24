package com.mastermindstefano.main.models;

public class Session {
    private Board board;
    private GameRegistry registry;
    private State state;
    public Session() {
        this.state = new State();
        this.board = new Board();
        this.registry = new GameRegistry(this.board);
    }
    public boolean isFinished(){
        return this.board.isFinished();
    }
    public int getAttempts(){
        return this.board.getAttempts();
    }
    public String getGuessRow(int index){
        return this.board.getGuessRow(index);
    }
    public String getGoal(int index){
        return this.board.getGoal(index);
    }
    public void addGuessRow(GuessRow guessRow){
        this.board.addGuessRow(guessRow);
    }
    public boolean undoable(){
        return this.registry.undoable();
    }
    public boolean redoable() {
        return this.registry.redoable();
    }
    public void reset() {
        this.board.clear();
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
        return this.board.isWinner();
    }
}
