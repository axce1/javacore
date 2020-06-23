package com.axce1_.javacore.oop.compound;

public class Demo {
    public static void main(String[] args) {
        Team team = new Team();

        Developer fJavaDeveloper = new JavaDeveloper();
        Developer sJavaDeveloper = new JavaDeveloper();
        Developer fCppDeveloper = new CppDeveloper();

        team.addDeveloper(fJavaDeveloper);
        team.addDeveloper(sJavaDeveloper);
        team.addDeveloper(fCppDeveloper);

        team.createProject();
    }
}
