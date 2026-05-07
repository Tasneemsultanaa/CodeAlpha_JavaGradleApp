package com.codealpha;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    void testAddTask() {
        TaskManager manager = new TaskManager();
        manager.addTask("Buy groceries");
        assertEquals(1, manager.getTaskCount());
    }

    @Test
    void testEmptyTaskList() {
        TaskManager manager = new TaskManager();
        assertEquals(0, manager.getTaskCount());
    }
}
