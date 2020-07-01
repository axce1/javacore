package com.axce1_.javacore.oop.Iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "spring", "maven"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("developer", skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer " + javaDeveloper.getName());
        System.out.println("Skills ");
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
