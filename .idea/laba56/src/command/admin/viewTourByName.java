package command.admin;
import command.Command;

public class viewTourByName implements Command {
    @Override
    public void execute() {
        System.out.println("Переглянути тур за назвою");
    }
}
