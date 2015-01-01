package com.gmail.lifeofreilly.command;

public interface Command {
    public void execute();

    public void undo();
}
