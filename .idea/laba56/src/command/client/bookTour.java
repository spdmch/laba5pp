package command.client;
import command.Command;

public class bookTour implements Command{
    @Override
    public void execute(){
        System.out.println("Забронювати тур");
    }
}
