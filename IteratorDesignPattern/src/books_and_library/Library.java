package books_and_library;

import java.util.List;

public class Library implements Aggregate<Book> {
    private final List<Book> booksList;

    public Library(List<Book> booksList) {
        this.booksList = booksList;
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(this.booksList);
    }
}
