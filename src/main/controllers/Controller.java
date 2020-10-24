package com.mastermindstefano.main.controllers;

import com.mastermindstefano.main.models.Session;

public abstract class Controller {
    protected Session session;
    Controller(Session session){
        this.session = session;
    }
}
