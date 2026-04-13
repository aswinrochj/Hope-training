package model;

public class FileTask extends Task {

    public FileTask(int id, String name, int priority) {
        super(id, name, priority);
    }

    public void execute() {
        System.out.println("Processing File Task: " + name);
    }
}
