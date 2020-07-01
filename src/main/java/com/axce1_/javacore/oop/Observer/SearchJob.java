package com.axce1_.javacore.oop.Observer;

public class SearchJob {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        jobSite.addVacancy("java position1");
        jobSite.addVacancy("java position2");

        Observer fSubscriber = new Subscriber("John Doe");
        Observer sSubscriber = new Subscriber("Jane Doe");

        jobSite.addObserver(fSubscriber);
        jobSite.addObserver(sSubscriber);

        jobSite.addVacancy("java position3");

        jobSite.removeVacancy("java position1");
    }
}
