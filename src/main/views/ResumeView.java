package com.mastermindstefano.main.views;

import com.mastermindstefano.utils.Print;

public class ResumeView {
    public boolean read(){
        return Print.instance().readResume(Message.RETRY.toString());
    }
}
