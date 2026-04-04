package com.Document_Editor.model;

public abstract class Element {
    private String id;

    public Element(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract void display();
}