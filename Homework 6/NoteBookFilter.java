import java.util.*;
public class NoteBookFilter {
    private Set<NoteBook> notebooks;

    public NoteBookFilter(Set<NoteBook> notebooks) {
        this.notebooks = notebooks;
    }

    public void filter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        int criteria = scanner.nextInt();
        Map<String, String> filterParams = new HashMap<>();
        switch (criteria) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int ram = scanner.nextInt();
                filterParams.put("ram", String.valueOf(ram));
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int hdd = scanner.nextInt();
                filterParams.put("hdd", String.valueOf(hdd));
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.next();
                filterParams.put("os", os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filterParams.put("color", color);
                break;
            default:
                System.out.println("Некорректный ввод");
                return;
        }
        Set<NoteBook> filteredNotebooks = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            boolean isMatch = true;
            for (Map.Entry<String, String> entry : filterParams.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                switch (key) {
                    case "ram":
                        if (notebook.getRam() < Integer.parseInt(value)) {
                            isMatch = false;
                        }
                        break;
                    case "hdd":
                        if (notebook.getHdd() < Integer.parseInt(value)) {
                            isMatch = false;
                        }
                        break;
                    case "os":
                        if (!notebook.getOs().equals(value)) {
                            isMatch = false;
                        }
                        break;
                    case "color":
                        if (!notebook.getColor().equals(value)) {
                            isMatch = false;
                        }
                        break;
                }
            }
            if (isMatch) {
                filteredNotebooks.add(notebook);
            }
        }
        System.out.println("Подходящие ноутбуки:");
        for (NoteBook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }
}
