package com.axce1_.javacore.oop.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Ok", Priority.ROUTINE);
        reportNotifier.notifyManager("Wrong", Priority.IMPORTANT);
        reportNotifier.notifyManager("Problem", Priority.ASAP);
    }
}
