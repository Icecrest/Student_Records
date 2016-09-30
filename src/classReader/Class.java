package classReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Written by SCurley on 9/21/2016.
 */
public class Class {

    private HashMap<String, Student> students = new HashMap<String, Student>();
    private Scanner k = new Scanner(System.in);
    private String tempName, tempAddress, tempNumber, tempMajor = new String();
    private ArrayList<String> keys = new ArrayList<String>();

    public void addStudent(){
       /*
        System.out.print("What is the student's name?");
        tempName = k.next();
        System.out.print("What is the student's address? (House number, Street name, and Street title [st, ave, dr, etc.]");
        tempAddress = k.next()+" "+k.next()+" "+k.next();
        System.out.print("What is the student's phone number?");
        tempNumber = k.next();
        System.out.print("What is the student's major? (One word or abbreviation)");
        tempMajor = k.next();

        students.put(tempName, new Student(tempName,tempAddress,tempNumber,tempMajor));
        keys.add(tempName);
        */


    }

    public void removeStudent(){
        String name;
        System.out.println("Which student would you like to remove from your class?");
        name = k.next();
        students.remove(name);
        keys.remove(name);
    }

    public void printAll(){
        for(String s : keys){
            System.out.println(s);
            System.out.println("    Name:"+students.get(s).getVar("name"));
            System.out.println("    Address:"+students.get(s).getVar("address"));
            System.out.println("    Phone Number:"+students.get(s).getVar("phonenumber"));
            System.out.println("    Major:"+students.get(s).getVar("major")+"\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printStudent(){
        String s = "";
        System.out.println("What student would you like to look up?");
        s = k.next();
        System.out.println(s);
        System.out.println("    Name:"+students.get(s).getVar("name"));
        System.out.println("    Address:"+students.get(s).getVar("address"));
        System.out.println("    Phone Number:"+students.get(s).getVar("phonenumber"));
        System.out.println("    Major:"+students.get(s).getVar("major")+"\n");
    }

    public void run(){
        boolean running = true;

        System.out.print("Running Program");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(running == true){
            System.out.print("\n\nWhat action would you like to take?\n1: Add a student" +
                    "\n2: Remove a student\n3: Print all student records\n4: Print specific student records" +
                    "\n5: Close program");
            int input = k.nextInt();
            switch (input){
                case 1:
                    this.addStudent();
                    break;
                case 2:
                    this.removeStudent();
                    break;
                case 3:
                    this.printAll();
                    break;
                case 4:
                    printStudent();
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.print("Invalid input, please retry");
                    break;
            }
        }
    }
}
