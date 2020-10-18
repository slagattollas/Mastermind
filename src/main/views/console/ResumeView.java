package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.Logic;
import com.mastermindstefano.main.views.Message;
import com.mastermindstefano.utils.Print;

public class ResumeView {
    private Logic logic;
    ResumeView(Logic logic){
        this.logic = logic;
    }
    public boolean interact(){
        boolean result = Print.instance().readResume(Message.RETRY.toString());
        if(result){
            this.logic.clear();
        }
        return result;
    }
}
