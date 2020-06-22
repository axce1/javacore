package com.axce1_.javacore.oop.prototype;

public class Runner {
    public static void main(String[] args) {
        Project project = new Project(1, "project", "source");
        System.out.println(project);

        Project projectClone = (Project) project.copy();
        System.out.println(projectClone);

        ProjectFactory factory = new ProjectFactory(project);
        Project copyProject = factory.cloneProject();
        System.out.println(copyProject);
    }
}
