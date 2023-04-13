import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("Model1", 8, 512, "Windows", "Black");
        NoteBook notebook2 = new NoteBook("Model2", 16, 1024, "MacOS", "Silver");
        NoteBook notebook3 = new NoteBook("Model3", 4, 256, "Linux", "Red");
        NoteBook notebook4 = new NoteBook("Model4", 8, 512, "Windows", "White");
        NoteBook notebook5 = new NoteBook("Model5", 16, 2048, "Windows", "Black");

        Set<NoteBook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);

        NoteBookFilter filter = new NoteBookFilter(notebooks);
        filter.filter();
    }
}
