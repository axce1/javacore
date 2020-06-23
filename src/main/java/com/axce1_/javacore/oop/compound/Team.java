package com.axce1_.javacore.oop.compound;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Developer> developerList = new ArrayList<>();

    void addDeveloper(Developer developer) {
        developerList.add(developer);
    }

    void createProject() {
        for (Developer develper :
                developerList) {
            develper.writeCode();
        }
    }
}
