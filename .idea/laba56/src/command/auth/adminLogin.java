package command.auth;

import command.Command;

public class adminLogin implements Command {
    @Override
    public void execute() {
        System.out.println("Вхід як адміністратор");
    }
}