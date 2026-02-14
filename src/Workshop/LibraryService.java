package Workshop;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private List<String> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(title);
    }

    public boolean searchBook(String title) {
        return books.contains(title);
    }

    public void clearLibrary() {
        books.clear();
    }
}

