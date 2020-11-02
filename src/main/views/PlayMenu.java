package com.mastermindstefano.main.views;

import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.utils.Menu;
import com.mastermindstefano.utils.Print;

public class PlayMenu extends Menu {
    PlayMenu(PlayController playController){
        this.addCommand(new PlayCommand(playController));
        this.addCommand(new UndoCommand(playController));
        this.addCommand(new RedoCommand(playController));
    }
}
