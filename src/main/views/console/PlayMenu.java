package com.mastermindstefano.main.views.console;

import com.mastermindstefano.main.controllers.PlayController;
import com.mastermindstefano.utils.Menu;

public class PlayMenu extends Menu {
    PlayMenu(PlayController playController){
        this.addCommand(new PlayCommand(playController));
        this.addCommand(new UndoCommand(playController));
        this.addCommand(new RedoCommand(playController));
    }
}
