package com.pravin.lede.gl.practice.CollectionAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Java program to insert an element into the array list at the first position.
 */
public class RetriveElementAtSpecifiedPosition {

    public static void main(String[] args) {

        //Create instance of array list as colorList
        ArrayList<String> colorList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String ch = null;

        //add colors as string in array list
        colorList.add("RED");
        colorList.add("BLUE");
        colorList.add("GREEN");
        colorList.add("ORANGE");
        colorList.add("VIOLATE");

        printElements(colorList, "Given Elements :");

        do {
            System.out.println("Enter position of element to retrieve :");
            int position = scan.nextInt();

            try {
                retrieveElement(position, colorList);
            } catch (NotPresentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Do you want retrieve element again?(y/n)");
            ch = scan.next();

        } while (ch.equalsIgnoreCase("y"));

    }

    private static void retrieveElement(int position, ArrayList<String> colorList) throws NotPresentException {
        if (position > colorList.size() - 1 || position < 0) {
            throw new NotPresentException("Element not present");
        } else {
            System.out.println("Element at position : " + position + " is : " + colorList.get(position));
        }
    }

    private static void printElements(ArrayList<String> colorList, String headerMessage) {

        System.out.println(headerMessage);

        //iterate through all elements
        Iterator iterator = colorList.iterator();
        int index = 0;
        System.out.println("Position\tElements");
        while (iterator.hasNext()) {
            System.out.println("\t" + index + ".\t\t" + iterator.next());
            index++;
        }

    }

    private static class NotPresentException extends Throwable {
        public NotPresentException(String s) {
            super(s);
        }
    }
}
