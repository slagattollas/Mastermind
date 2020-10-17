package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.ResumeController;
import com.mastermindstefano.main.views.Message;
import com.mastermindstefano.utils.Print;

public class ResumeView {
    private ResumeController resumeController;
    ResumeView(ResumeController resumeController){
        this.resumeController = resumeController;
    }
    public boolean interact(){
        boolean result = Print.instance().readResume(Message.RETRY.toString());
        if(result){
            this.resumeController.clear();
        }
        return result;
    }
}
