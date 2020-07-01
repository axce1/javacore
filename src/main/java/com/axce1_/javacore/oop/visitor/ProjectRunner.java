package com.axce1_.javacore.oop.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        project.beWritten(junior);
        project.beWritten(senior);
    }
}
