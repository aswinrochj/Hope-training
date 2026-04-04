package com.Document_Editor.model;

import java.util.*;

public class Document {
    private String title;
    private List<Element> elements;

    public Document(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    public void addElement(Element e) {
        elements.add(e);
    }

    public void removeElement(String id) {
        elements.removeIf(e -> e.getId().equals(id));
    }

    public void display() {
        System.out.println("Document: " + title);
        for (Element e : elements) {
            e.display();
        }
    }
}