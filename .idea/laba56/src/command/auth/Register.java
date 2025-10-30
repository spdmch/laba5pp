package command.auth;

import command.Command;

public class Register implements Command {
    @Override
    public void execute() {
        System.out.println("Реєстрація");
    }
}