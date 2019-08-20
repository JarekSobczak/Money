package com.sda.projects.money;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, UnproperDateException {
        NBPSessionService session=new NBPSessionService();
        session.showSessionResults();
        session.setDate("2019-08-16");
        session.showSessionResults();
    }
}

