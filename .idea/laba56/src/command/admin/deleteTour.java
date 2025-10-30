package command.admin;
import command.Command;

public class deleteTour implements Command {
    @Override
    public void execute() {
        System.out.println("Видалення туру");
    }
}
