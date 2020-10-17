package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.models.Board;
import com.mastermindstefano.main.views.Message;
import com.mastermindstefano.utils.Print;

public class ResumeView extends SubView {
    ResumeView(Board board){
        super(board);
    }
    public boolean interact(){
        boolean result = Print.instance().readResume(Message.RETRY.toString());
        if(result){
            this.board.clear();
        }
        return result;
    }
}
