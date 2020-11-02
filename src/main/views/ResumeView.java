package com.mastermindstefano.main.views;

import com.mastermindstefano.main.controllers.ResumeController;
import com.mastermindstefano.utils.Print;

public class ResumeView {
    public void interact(ResumeController resumeController){
        boolean result = Print.instance().readResume(Message.RETRY.toString());
        resumeController.resume(result);
    }
}
