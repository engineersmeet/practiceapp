package com.pravin.lede.gl.practice.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Company {

    public static void main(String[] args){

        List<Employee> employeeList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("1. Add data :");
            System.out.println("2. Print all employees who are developers :");
            System.out.println("3. Print all employee names who have not worked in other organizations :");
            System.out.println("4. Print all employee names who have experience more than two years and are developers :");
            System.out.println("5. Exit :");
            System.out.println("Enter your choice::");
            int choice = scan.nextInt();

                switch(choice){
                    case 1:
                        addData(scan, employeeList);
                        break;
                    case 2:
                        printDevEmployees(employeeList);
                        break;
                    case 3:
                        printFresherEmployees(employeeList);
                        break;
                    case 4:
                        printTwoYearExpEmp(employeeList);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");

                }
        }
    }

    private static void printTwoYearExpEmp(List<Employee> employeeList) {
        Iterator<Employee> employeeIterator = employeeList.iterator();

        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            History history = employee.getHistory();

            if(history.getExperience()>2.0 && employee.getDesignation().equalsIgnoreCase("developer")){
                System.out.println("Name : "+employee.getName());
            }
        }
    }


    private static void printFresherEmployees(List<Employee> employeeList) {
        Iterator<Employee> employeeIterator = employeeList.iterator();

        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            History history = employee.getHistory();
            if(!history.isPreviouslyWorked()){
                System.out.println("Name : "+employee.getName());
            }
        }
    }

    private static void printDevEmployees(List<Employee> employeeList) {

        Iterator<Employee> employeeIterator = employeeList.iterator();

        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            if(employee.getDesignation().equalsIgnoreCase("developer")){
                System.out.println("Name : "+employee.getName());
            }
        }

    }

    private static List<Employee> addData(Scanner scan, List<Employee> employeeList) {
        String choice = null;
        do{
            System.out.println("Enter Employee Name : ");
            String name = scan.next();

            System.out.println("Enter Employee age : ");
            Double age = scan.nextDouble();

            System.out.println("Enter Employee Designation : ");
            String designation = scan.next();

            System.out.println("Enter Employee Qualification : ");
            String qualification = scan.next();

            System.out.println("Enter Marks : ");
            Double marks = scan.nextDouble();

            System.out.println("Enter Qualification Date : ");
            String date = scan.next();

            System.out.println("Enter Organisation : ");
            String org = scan.next();

            System.out.println("Enter Experience : ");
            Double exp = scan.nextDouble();

            System.out.println("Enter projects : ");
            String projects = scan.next();

            System.out.println("Is Employee worked before in any organisation?(y/n)");
            String ans = scan.next();

            boolean isWorked = ans.equals("y");

            Education education = new Education(qualification,marks,date);
            History history = new History(org,exp,projects, isWorked);
            Employee employee = new Employee(name,age,designation,education,history);
            employeeList.add(employee);

            System.out.println("Data Successfully Saved!!");

            System.out.println("Do you want to add record again?(Y/N)");
            choice = scan.next();

        }while (choice.equals("Y")||choice.equals("y"));

        return employeeList;

    }
}
