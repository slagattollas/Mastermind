package com.mastermindstefano.main.models;

import com.mastermindstefano.utils.Print;

import java.util.ArrayList;
import java.util.List;

public class GameRegistry {
    private List<GameMemento> mementoList;
    private Game game;
    private int indexMemento = -1;
    private int undoed = 0;
    GameRegistry(Game game){
        this.game = game;
        this.reset();
    }
    void reset() {
        this.mementoList = new ArrayList<GameMemento>();
        this.indexMemento = 0;
        this.undoed = 0;
    }
    void registry() {
        if(this.mementoList.size() > 0){
            this.mementoList.remove(indexMemento);
        }
        Print.instance().writeln(this.indexMemento);
        this.mementoList.add(this.indexMemento, new GameMemento(this.game));
        this.indexMemento++;
    }
    void undo(){
        this.indexMemento--;
        this.game.set(this.mementoList.get(indexMemento).getBoard());
        this.undoed = 1;
    }
    boolean undoable() {
        return this.indexMemento > 0;
    }
    void redo(){
        this.indexMemento++;
        this.game.set(this.mementoList.get(indexMemento).getBoard());
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
