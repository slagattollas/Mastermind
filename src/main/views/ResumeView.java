package com.mastermindstefano.main.views;

import com.mastermindstefano.utils.Print;

public class ResumeView {
    public boolean isGameResumed(){
        return Print.instance().readResume(Message.RETRY.toString());
    }
}
