package model;

public class CalculationTask extends Task {

    private int num1, num2;

    public CalculationTask(int id, String name, int priority, int n1, int n2) {
        super(id, name, priority);
        this.num1 = n1;
        this.num2 = n2;
    }

    public void execute() {
        int result = num1 + num2;
        System.out.println("Calculation Result: " + result);
    }
}
