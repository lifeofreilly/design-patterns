package com.gmail.lifeofreilly.command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        //no command
    }

    @Override
    public void undo() {
        //no command
    }
}
