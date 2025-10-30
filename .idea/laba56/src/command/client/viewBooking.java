package command.client;
import command.Command;

public class viewBooking implements Command {
    @Override
    public void execute(){
        System.out.println("Переглянути бронювання");
    }
}
