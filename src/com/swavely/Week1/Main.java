// Justin Swavely 2/4/2019, This project will take user tasks and display, remove, or update them.
package com.swavely.Week1;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int i = 0;
        int Max = 1000;
        String l[] = new String[Max];
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hey, do you want to make a to do list (1) yes (0) no");
        String a = userInput.nextLine();
        String p [] = new String[Max];
        int x = Integer.parseInt(a);
        if (x == 1) {
            add(i, Max, l,p);
        }
        if (x == 0) {
            System.out.println("Have a good day");
        }
    }


    public static void add(int i, int Max, String[] l, String[] p) {
        Max += 1;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your task");
        l[i] = userInput.nextLine();
        System.out.println("Write a description of your task");
        p[i] = userInput.nextLine();
        i = i + 1;
        System.out.println("If you would like to make another task(1)");
        System.out.println("If you would like to delete a task (2)");
        System.out.println("If you would like to update a task(3)");
        System.out.println("If you would like to show all tasks (4)");
        System.out.println("If you would like to exit the program (5)");
        int choice = userInput.nextInt();
        if (choice == 1) {
            add(i, Max, l,p);
        }
        if (choice == 2) {
            remove(i, Max, l,p);
        }
        if (choice == 3) {
            update(i, Max, l,p);
        }
        if (choice == 4) {
            display(i, Max, l,p);
        }
        if (choice == 5) {
            end();
        }
    }

    public static void remove(int i, int Max, String[] l, String[] p) {
        Scanner userInput = new Scanner(System.in);
        for (int k = 0; k < l.length; k++) {
            if (l[k] == null) {
                continue;
            } else {
                System.out.println(k + " " + l[k] + " " + p[k]);
            }
        }
        System.out.println("Which to do would you like to delete please enter the number assign to the task");
        int removeIndex = userInput.nextInt();
        for (int n = removeIndex; n < l.length - 1; n++) {
            l[n] = l[n + 1];
            p[n] = p[n + 1];
        }
        System.out.println("If you would like to make another task(1)");
        System.out.println("If you would like to delete a task (2)");
        System.out.println("If you would like to update a task(3)");
        System.out.println("If you would like to show all tasks (4)");
        System.out.println("If you would like to exit the program (5)");
        int choice = userInput.nextInt();
        if (choice == 1) {
            add(i, Max, l,p);
        }
        if (choice == 2) {
            remove(i, Max, l,p);
        }
        if (choice == 3) {
            update(i,Max,l,p);
        }
        if (choice == 4) {
            display(i, Max, l,p);
        }
        if(choice ==5){
            end();
        }
    }

    public static void update(int i, int Max, String[] l, String[] p) {
        Scanner userInput = new Scanner(System.in);
        Scanner Input = new Scanner(System.in);
        for (int z = 0; z < l.length; z++) {
            if (l[z] == null) {
                continue;
            } else {
                System.out.println(z + " " + l[z] + " " + p[z]);
            }
        }
        System.out.println("Please enter the assigned number to the task you wish to update");
        int h = userInput.nextInt();
        System.out.println("Please type your task update below for item " + h);
        String pl = Input.nextLine();
        l[h] = pl;
        System.out.println("Please update your description");
        String xl = Input.nextLine();
        p[h]= xl;
        System.out.println("If you would like to make another task(1)");
        System.out.println("If you would like to delete a task (2)");
        System.out.println("If you would like to update a task(3)");
        System.out.println("If you would like to show all tasks (4)");
        System.out.println("If you would like to exit the program (5)");
        int choice = userInput.nextInt();
        if(choice ==1)

        {
            add(i, Max, l, p);
        }
        if(choice ==2)

        {
            remove(i, Max, l, p);
        }
        if(choice ==3)
            update(i, Max, l, p);
        {

        }
        if(choice ==4) {
            display(i, Max, l, p);
        }
        if(choice==5){
            end();
        }

    }
    public static void display(int i, int Max, String[] l, String[] p) {
        Scanner userInput = new Scanner(System.in);
        int decision = 1;
        while (decision != 0) {
            for (int u = 0; u < l.length; u++) {
                if (l[u] == null) {
                    continue;
                } else {
                    System.out.println(u + " " + l[u] + " " + p[u]);
                }
            }
            System.out.println("Press (0) to continue the program");
            decision = userInput.nextInt();
        }
        System.out.println("If you would like to make another task(1)");
        System.out.println("If you would like to delete a task (2)");
        System.out.println("If you would like to update a task(3)");
        System.out.println("If you would like to show all tasks (4)");
        System.out.println("If you would like to exit the program (5)");
        int choice = userInput.nextInt();
        if (choice == 1) {
            add(i, Max, l, p);
        }
        if (choice == 2) {
            remove(i, Max, l, p);
        }
        if (choice == 3) {
            update(i,Max,l, p);
        }
        if (choice == 4) {
            display(i, Max, l, p);
        }
        if (choice ==5 ){
            end();
        }
    }
    public static void end() {
        System.out.println("Have a good day");
    }
}