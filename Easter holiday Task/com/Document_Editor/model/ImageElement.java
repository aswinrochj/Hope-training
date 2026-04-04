package com.Document_Editor.model;

public class ImageElement extends Element {
    private String path;

    public ImageElement(String id, String path) {
        super(id);
        this.path = path;
    }

    @Override
    public void display() {
        System.out.println("Image: " + path);
    }
}