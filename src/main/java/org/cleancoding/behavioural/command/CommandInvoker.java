package org.cleancoding.behavioural.command;

public class CommandInvoker {

    public void run(Command command) {
        command.execute();
    }
}