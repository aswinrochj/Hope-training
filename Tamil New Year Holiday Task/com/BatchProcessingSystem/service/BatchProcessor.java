package service;

import java.util.*;
import model.Task;

public class BatchProcessor {

    private List<Task> tasks = new ArrayList<>();
    private Map<Integer, String> results = new HashMap<>();

    public void addTask(Task t) {
        tasks.add(t);
    }

    public void processTasks() {
        Collections.sort(tasks);

        for (Task t : tasks) {
            try {
                t.execute();
                results.put(t.getId(), "Success");
            } catch (Exception e) {
                results.put(t.getId(), "Failed");
            }
        }
    }

    public void showResults() {
        for (Map.Entry<Integer, String> entry : results.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
