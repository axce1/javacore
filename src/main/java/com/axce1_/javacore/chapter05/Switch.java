package com.axce1_.javacore.chapter05;

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "zima";
                break;
            case 3:
            case 4:
            case 5:
                season = "vesna";
                break;
            case 6:
            case 7:
            case 8:
                season = "leto";
                break;
            case 9:
            case 10:
            case 11:
                season = "osen'";
                break;
            default:
                season = "none";
        }
        System.out.println(season);
    }
}
