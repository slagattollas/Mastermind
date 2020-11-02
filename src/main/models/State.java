package com.mastermindstefano.main.models;


public class State {
    private StateValue stateValue;
    public State(){
        this.reset();
    }
    public void reset(){
        this.stateValue = stateValue.INITIAL;
    }
    public void next() {
        this.stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
    }
    public StateValue getValueState() {
        return this.stateValue;
    }
}
