package com.pravin.lede.gl.practice.CollectionAssignments;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *Java program to iterate through all elements in a array list.
 */
public class IterateAllElements {

    public static void main(String[] args){

        //Create instance of array list as colorList
        ArrayList<String> colorList = new ArrayList<>();

        //add colors as string in array list
        colorList.add("RED");
        colorList.add("BLUE");
        colorList.add("GREEN");
        colorList.add("ORANGE");

        //iterate through all elements
        Iterator iterator = colorList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
