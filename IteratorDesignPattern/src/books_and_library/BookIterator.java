package books_and_library;

import java.util.List;

public class BookIterator implements Iterator<Book> {
    private final List<Book> books;
    private int index;

    public BookIterator(List<Book> books) {
        this.books = books;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < this.books.size();
    }

    @Override
    public Book next() {
        if (this.hasNext()) return books.get(index++);
        return null;
    }
}
