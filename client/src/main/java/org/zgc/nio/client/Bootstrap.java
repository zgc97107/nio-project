package org.zgc.nio.client;

import org.jline.reader.UserInterruptException;
import org.zgc.nio.client.command.Command;
import org.zgc.nio.client.thread.Processor;
import org.zgc.nio.client.tools.CommandReader;

import java.io.IOException;

/**
 * @author lucheng
 * @since 2022/8/24
 */
public class Bootstrap {
    public static boolean isStart = true;
    public static void main(String[] args) throws InterruptedException, IOException {
        Processor processor = new Processor("localhost", 8848);
        processor.start();
        CommandReader reader = new CommandReader();
        try {
            while (isStart) {
                Command command = reader.readCommand();
                command.execute(processor);
            }
        } catch (UserInterruptException e){
            isStart = false;
            processor.exit();
            System.exit(0);
        }

    }
}
