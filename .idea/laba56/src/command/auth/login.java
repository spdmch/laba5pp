package command.auth;

import command.Command;

public class login implements Command {
    @Override
    public void execute() {
        System.out.println("Вхід у клієнтський акаунт");
    }
}