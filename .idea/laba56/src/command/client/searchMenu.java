package command.client;

import command.Command;

public class searchMenu implements Command {
    @Override
    public void execute() {
        System.out.println("Відкрито меню пошуку турів");
        System.out.println("   1. За країною");
        System.out.println("   2. За назвою");
        System.out.println("   3. За ціновою категорією");
        System.out.println("   4. За датою виїзду");
        System.out.println("   5. За типом путівки");
        System.out.println("   6. За типом проживання");
        System.out.println("   7. За екскурсіями");
        System.out.println("   0. Назад");
    }
}