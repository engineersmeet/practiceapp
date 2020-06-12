package com.pravin.lede.gl.practice.CollectionAssignments;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Java program to insert an element into the array list at the first position.
 */
public class InsertElementAtFirstPosition {

    public static void main(String[] args){

        //Create instance of array list as colorList
        ArrayList<String> colorList = new ArrayList<>();

        //add colors as string in array list
        colorList.add("RED");
        colorList.add("BLUE");
        colorList.add("GREEN");
        colorList.add("ORANGE");

        printElements(colorList, "Before insertion :");

        //Insert element at first position
        colorList.add(0, "VIOLATE");

        printElements(colorList,"After insertion :");

    }

    private static void printElements(ArrayList<String> colorList, String headerMessage) {

        System.out.println(headerMessage);

        //iterate through all elements
        Iterator iterator = colorList.iterator();

        while (iterator.hasNext()){
            System.out.println("\t"+iterator.next());
        }

    }

}
