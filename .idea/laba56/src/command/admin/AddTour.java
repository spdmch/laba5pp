
package command.admin;
import command.Command;

public class AddTour implements Command {
    @Override
    public void execute() {
        System.out.println("Додавання нового туру");
    }
}