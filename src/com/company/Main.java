package com.company;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String quit, enter = "";
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println(colors);

        System.out.println("The color at index 1 is " + colors.get(1));


        //do {
//        System.out.println("Enter a color");
//        enter = input.nextLine();
//
//        if(!enter.equalsIgnoreCase("Q")) {
//            colors.add(enter);
//        }


//while (!enter.equalsIgnoreCase("Q"));
        //        System.out.println("Enter a color");
//        enter = input.nextLine();

        //        if(!enter.equalsIgnoreCase("Q")) {
//            colors.add(enter);
//        }

        //for (int index = 0; index<colors.size(); index++){
        //System.out.println(colors.get(index));
        // Or simpler way
        //     for (String s : colors);  s= could be anything; a name given to a variable that stores the variables
//        System.out.println(s);


        do {
            System.out.println("Enter a new color");
            String colorInput = input.nextLine();

            System.out.println("Add new color Y(yes) or Q (quit)");
            quit = input.nextLine();

            colors.add(colorInput);
            System.out.println(colors);

            System.out.println();

        } while (!quit.equalsIgnoreCase( "Q"));
        return;
    }
}

