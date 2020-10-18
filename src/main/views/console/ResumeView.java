package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.ResumeController;
import com.mastermindstefano.main.views.Message;
import com.mastermindstefano.utils.Print;

public class ResumeView {
    public boolean interact(ResumeController resumeController){
        boolean result = Print.instance().readResume(Message.RETRY.toString());
        if(result){
            resumeController.clear();
        }else{
            resumeController.next();
        }
        return result;
    }
}
