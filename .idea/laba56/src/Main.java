import command.admin.*;
import menu.Menu;
import menu.MenuBuilder;

public class Main {
    private static boolean isLoggedIn = false;
    private static boolean isAdmin = false;

    public static void main(String[] args) {
        while (true) {
            Menu mainMenu = MenuBuilder.createMainMenu();
            mainMenu.show();
            String choice = mainMenu.input();

            if (choice.equals("0")) {
                System.out.println("Дякуємо за використання!");
                break;
            }

            switch (choice) {
                case "1" -> {
                    new command.auth.login().execute();
                    isLoggedIn = true;
                    showClientMenu();
                }
                case "2" -> new command.auth.Register().execute();
                case "3" -> {
                    new command.auth.adminLogin().execute();
                    isAdmin = true;
                    showAdminMenu();
                }
                default -> mainMenu.execute(choice);
            }
        }
    }

    private static void showClientMenu() {
        while (isLoggedIn) {
            Menu menu = MenuBuilder.createClientMenu();
            menu.show();
            String choice = menu.input();

            if (choice.equals("1")) {
                showSearchMenu();
            } else if (choice.equals("2")) {
                new command.client.viewBooking().execute();
            } else if (choice.equals("0")) {
                isLoggedIn = false;
                System.out.println("Вихід з акаунту...");
            }
        }
    }

    private static void showAdminMenu() {
        while (isAdmin) {
            Menu menu = MenuBuilder.createAdminMenu();
            menu.show();
            String choice = menu.input();

            if (choice.equals("0")) {
                isAdmin = false;
                System.out.println("Вихід з адмін-панелі...");
                break;
            }

            switch (choice) {
                case "1" -> new viewTour().execute();
                case "2" -> new AddTour().execute();
                case "3" -> new deleteTour().execute();
                case "4" -> new editTour().execute();
                case "5" -> new viewTourByName().execute();
            }
        }
    }

    private static void showSearchMenu() {
        Menu menu = MenuBuilder.createSearchSubMenu();
        while (true) {
            menu.show();
            String choice = menu.input();
            if (choice.equals("0")) break;
            menu.execute(choice);
        }
    }
}