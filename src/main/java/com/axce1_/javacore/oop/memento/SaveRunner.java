package com.axce1_.javacore.oop.memento;

public class SaveRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Repo repo = new Repo();

        project.setVerionAndDate("verson 1.0");
        System.out.println(project);

        System.out.println("save project");
        repo.setSave(project.save());

        project.setVerionAndDate("version 1.1");
        System.out.println(project);

        project.load(repo.getSave());
        System.out.println(project);
    }
}
