import books_and_library.Book;
import books_and_library.Iterator;
import books_and_library.Library;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> booksList = Arrays.asList(
                new Book(100, "Science"),
                new Book(200, "Maths"),
                new Book(50, "Social Studies"),
                new Book(150, "Drawing")
        );

        Library lib = new Library(booksList);
        Iterator<Book> itr = lib.createIterator();

        while (itr.hasNext()) {
            Book book = itr.next();
            System.out.println(book.getBookName());
        }
    }
}
