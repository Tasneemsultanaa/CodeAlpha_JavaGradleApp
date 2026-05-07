package com.codealpha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("   Task Manager App    ");
        System.out.println("=======================");

        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = scanner.nextLine();
                manager.addTask(task);
                System.out.println("Task added!");
            } else if (choice == 2) {
                manager.displayTasks();
            } else {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}
