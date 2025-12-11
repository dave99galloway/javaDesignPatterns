package com.designpatterns.behavioral.command;

import com.sun.jdi.request.InvalidRequestStateException;

import javax.annotation.Nonnull;

public class RemoteControl {

    @Nonnull
    private Command command;

    public RemoteControl() {
        command = new Command() {
            @Override
            public void execute() {
                throwNoOpException();
            }

            @Override
            public void undo() {
                throwNoOpException();
            }
        };
    }

    private static void throwNoOpException() {
        throw new InvalidRequestStateException("must call setCommand with an implementation of Command");
    }

    public void setCommand(@Nonnull Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }
}
