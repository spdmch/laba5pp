package menu;

import command.*;
import command.admin.*;
import command.auth.*;
import command.client.*;

public class MenuBuilder {

    public static Menu createMainMenu() {
        Menu m = new Menu("main");
        m.addOption("1", null, new login());
        m.addOption("2", null, new Register());
        m.addOption("3", null, new adminLogin());
        m.addOption("0", null, () -> System.exit(0));
        return m;
    }

    public static Menu createClientMenu() {
        Menu m = new Menu("client");
        m.addOption("1", null, new searchMenu());
        m.addOption("2", null, new viewBooking());
        m.addOption("0", null, () -> System.out.println("Вихід..."));
        return m;
    }

    public static Menu createAdminMenu() {
        Menu m = new Menu("admin");
        m.addOption("1", null, new viewTour());
        m.addOption("2", null, new AddTour());
        m.addOption("3", null, new deleteTour());
        m.addOption("4", null, new editTour());
        m.addOption("5", null, new viewTourByName());
        m.addOption("0", null, () -> System.out.println("Вихід з адмін-панелі..."));
        return m;
    }

    public static Menu createSearchSubMenu() {
        Menu m = new Menu("search");
        m.addOption("1", null, stub("Пошук за країною"));
        m.addOption("2", null, stub("Пошук за назвою"));
        m.addOption("3", null, stub("Пошук за ціною"));
        m.addOption("4", null, stub("Пошук за датою"));
        m.addOption("5", null, stub("Пошук за типом"));
        m.addOption("6", null, stub("Пошук за проживанням"));
        m.addOption("7", null, stub("Пошук за екскурсіями"));
        m.addOption("0", null, () -> {});
        return m;
    }

    private static Command stub(String msg) {
        return () -> System.out.println("[СТУБ] " + msg + "...");
    }
}