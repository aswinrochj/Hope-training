package com.Document_Editor.main;

import com.Document_Editor.model.*;
import com.Document_Editor.service.EditorService;

public class MainApp {
    public static void main(String[] args) {
        try {
            User user = new User("Arrow");

            Document doc = new Document("My Document");
            EditorService editor = new EditorService(doc);

            editor.addText("1", "Hello World!");
            editor.addImage("2", "/img/sample.png");
            editor.addText("3", "OOP with packages!");

            editor.showDocument();

            System.out.println("\nAfter deletion:");
            editor.deleteElement("2");
            editor.showDocument();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}