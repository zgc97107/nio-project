package org.zgc.nio.client.command;

import org.zgc.nio.client.thread.Processor;

public class NoOpCommand implements Command {

    @Override
    public void execute(Processor client) {

    }
}
