package main;

import service.BatchProcessor;
import model.*;
import util.NameComparator;

import java.util.Collections;

public class MainApp {
    public static void main(String[] args) {

        BatchProcessor bp = new BatchProcessor();

        bp.addTask(new FileTask(1, "Upload", 2));
        bp.addTask(new CalculationTask(2, "Addition", 1, 10, 20));

        bp.processTasks();
        bp.showResults();

        Collections.sort(bp.getTasks(), new NameComparator());
    }
}
