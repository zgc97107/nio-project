package org.zgc.nio.client.command;

public abstract class AbstractCommand implements Command{

    protected String command;
    protected String[] args;


    public AbstractCommand(String command){
        this.command = command;
        this.args = command.split(" ");
    }

}
