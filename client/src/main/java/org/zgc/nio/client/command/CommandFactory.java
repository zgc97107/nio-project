package org.zgc.nio.client.command;

import org.zgc.nio.client.tools.CommandReader;

public class CommandFactory {
    public static Command getCommand(String command, CommandReader commandReader) {
        if (command == null || command.equals(""))
            return new NoOpCommand();
        command = command.trim();
        try {
            if (command.startsWith("invoke")) {
                return new MethodInvokeCommand(command);
            }
            if (command.length() > 0) {
                System.out.println("无法识别命令：" + command);
            }
        }catch (Exception e){
            System.out.println("无法识别命令：" + command);
        }
        return new NoOpCommand();
    }
}
