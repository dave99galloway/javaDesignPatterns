package com.designpatterns.behavioral.command;

/**
 * Command interface for Command pattern.
 */
public interface Command {
    void execute();

    void undo();
}
