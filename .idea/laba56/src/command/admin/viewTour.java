package command.admin;
import command.Command;

public class viewTour implements Command{
    @Override
    public void execute(){
        System.out.println("Переглянути всі тури");
    }
}
