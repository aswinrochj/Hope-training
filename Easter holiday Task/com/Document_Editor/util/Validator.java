package com.Document_Editor.util;

public class Validator {

    public static void validateText(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Text cannot be empty!");
        }
    }
}