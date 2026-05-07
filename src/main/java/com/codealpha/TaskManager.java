package com.codealpha;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }
        System.out.println("\n--- Your Tasks ---");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public int getTaskCount() {
        return tasks.size();
    }
}
