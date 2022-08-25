package org.zgc.nio.client.command;

import org.zgc.nio.client.thread.Processor;

public interface Command {
    void execute(Processor client);
}
