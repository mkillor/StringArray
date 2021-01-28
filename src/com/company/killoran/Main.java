package com.company.killoran;

public class Main {

    public static void main(String[] args) {
        //this example demonstrates how to solve the removing of first and last character provided a string value.

        String name = "Simeon";
        System.out.println(name);

        //new name is stored with a subset of initial String value
        name = name.substring(1, name.length() - 1); //1 skips index 0 and length-1 prints up to the last character
        System.out.println(name);

    }
}
