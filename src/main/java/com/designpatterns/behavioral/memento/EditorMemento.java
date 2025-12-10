package com.designpatterns.behavioral.memento;

/**
 * Memento pattern for saving and restoring object state.
 */
public class EditorMemento {
    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
