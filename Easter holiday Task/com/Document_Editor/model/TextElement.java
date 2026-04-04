package com.Document_Editor.model;

import com.Document_Editor.util.Validator;

public class TextElement extends Element {
    private String text;

    public TextElement(String id, String text) {
        super(id);
        setText(text);
    }

    public void setText(String text) {
        Validator.validateText(text);
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("Text: " + text);
    }
}