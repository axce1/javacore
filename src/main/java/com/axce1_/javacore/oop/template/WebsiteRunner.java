package com.axce1_.javacore.oop.template;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebSiteTemplate welcomePage = new WelcomePage();
        WebSiteTemplate newsPage = new NewsPage();
        welcomePage.showPage();
        newsPage.showPage();
    }
}
