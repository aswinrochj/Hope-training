package model;

import interfaces.Processable;

public abstract class Task implements Processable, Comparable<Task> {
    protected int id;
    protected String name;
    protected int priority;

    public Task(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public int compareTo(Task t) {
        return this.priority - t.priority;
    }

    // ✅ Getters (IMPORTANT)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}