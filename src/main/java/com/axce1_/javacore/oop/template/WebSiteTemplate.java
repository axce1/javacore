package com.axce1_.javacore.oop.template;

public abstract class WebSiteTemplate {
    public void showPage() {
        System.out.println("header");
        showPageContent();
        System.out.println("footer");
    }

    public abstract void showPageContent();
}
