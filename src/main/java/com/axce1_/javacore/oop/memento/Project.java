package com.axce1_.javacore.oop.memento;

import java.util.Date;

public class Project {
    private String verion;
    private Date date;

    public void setVerionAndDate(String verion) {
        this.verion = verion;
        this.date = new Date();
    }

    public Save save(){
        return new Save(verion);
    }

    public void load(Save save) {
        verion = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project{" +
                "verion='" + verion + '\'' +
                ", date=" + date +
                '}';
    }
}
