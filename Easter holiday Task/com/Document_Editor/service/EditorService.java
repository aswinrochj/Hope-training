package com.Document_Editor.service;

import com.Document_Editor.model.*;

public class EditorService {
    private Document document;

    public EditorService(Document document) {
        this.document = document;
    }

    public void addText(String id, String text) {
        document.addElement(new TextElement(id, text));
    }

    public void addImage(String id, String path) {
        document.addElement(new ImageElement(id, path));
    }

    public void deleteElement(String id) {
        document.removeElement(id);
    }

    public void showDocument() {
        document.display();
    }
}