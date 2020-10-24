package com.mastermindstefano.main.models;

import java.util.ArrayList;
import java.util.List;

public class GameRegistry {
    private List<GameMemento> mementoList;
    private Board board;
    private int indexMemento = -1;
    private int undoed = 0;
    GameRegistry(Board board){
        this.board = board;
        this.reset();
    }
    void reset() {
        this.mementoList = new ArrayList<GameMemento>();
        this.indexMemento = 0;
        this.undoed = 0;
    }
    void registry() {
        this.indexMemento++;
        this.mementoList.remove(indexMemento);
        this.mementoList.add(this.indexMemento, new GameMemento(this.board));
    }
    void undo(){
        this.indexMemento--;
        this.board.set(this.mementoList.get(indexMemento).getBoard());
        this.undoed = 1;
    }
    boolean undoable() {
        return this.indexMemento > 0;
    }
    void redo(){
        this.indexMemento++;
        this.board.set(this.mementoList.get(indexMemento).getBoard());
        if(this.mementoList.size() == this.indexMemento){
            this.undoed = 0;
        }
    }
    boolean redoable() {
        if(this.undoed == 1 && this.mementoList.size() > 1){
            return true;
        }
        return false;
    }
}
