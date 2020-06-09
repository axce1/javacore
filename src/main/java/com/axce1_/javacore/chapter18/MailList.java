package com.axce1_.javacore.chapter18;

import java.util.LinkedList;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.city = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return name + '\n' +
               street + '\n' +
               city + '\n' +
               state + '\n' +
               code;
    }
}

class MailList {
    public static void main(String[] args) {
        LinkedList<Address> m1 = new LinkedList<>();

        m1.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        m1.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        m1.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));

        for (Address el :
                m1) {
            System.out.println(el + "\n");
        }
        System.out.println();
    }
}

