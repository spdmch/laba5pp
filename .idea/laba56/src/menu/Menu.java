package menu;

import command.Command;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final Map<String, Command> commands = new LinkedHashMap<>();
    private final Scanner scanner = new Scanner(System.in);
    private final String type;

    public Menu(String type) {
        this.type = type;
    }

    public void addOption(String key, String label, Command command) {
        commands.put(key, command);
    }

    public void show() {
        System.out.println("\n=== МЕНЮ ===");
        commands.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ". " + getLabel(e.getKey())));
        System.out.print("Виберіть опцію: ");
    }

    private String getLabel(String key) {
        return switch (type) {
            case "main" -> switch (key) {
                case "1" -> "Увійти як клієнт";
                case "2" -> "Зареєструватися";
                case "3" -> "Увійти як адміністратор";
                case "0" -> "Вихід";
                default -> "Невідома опція";
            };
            case "client" -> switch (key) {
                case "1" -> "Забронювати тур";
                case "2" -> "Переглянути заброньовані тури";
                case "0" -> "Вийти з акаунту";
                default -> "Невідома опція";
            };
            case "admin" -> switch (key) {
                case "1" -> "Переглянути всі тури";
                case "2" -> "Додати тур";
                case "3" -> "Видалити тур";
                case "4" -> "Змінити тур";
                case "5" -> "Знайти тур за назвою";
                case "0" -> "Вихід";
                default -> "Невідома опція";
            };
            case "search" -> switch (key) {
                case "1" -> "Знайти за країною";
                case "2" -> "Знайти за назвою";
                case "3" -> "Знайти за ціновою категорією";
                case "4" -> "Знайти за датою виїзду";
                case "5" -> "Знайти за типом путівки";
                case "6" -> "Знайти за типом проживання";
                case "7" -> "Знайти за екскурсіями";
                case "0" -> "Назад";
                default -> "Невідома опція";
            };
            default -> "Невідома опція";
        };
    }

    public void execute(String choice) {
        Command cmd = commands.get(choice);
        if (cmd != null) {
            cmd.execute();
        } else {
            System.out.println("Невірний вибір!");
        }
    }

    public String input() {
        return scanner.nextLine().trim();
    }
}