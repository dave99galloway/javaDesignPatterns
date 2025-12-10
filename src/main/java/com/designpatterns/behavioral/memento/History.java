package com.designpatterns.behavioral.memento;

import java.util.Stack;

public class History {
    private Stack<EditorMemento> mementos = new Stack<>();

    public void push(EditorMemento memento) {
        mementos.push(memento);
    }

    public EditorMemento pop() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        }
        return null;
    }

    public boolean isEmpty() {
        return mementos.isEmpty();
    }
}
