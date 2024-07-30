package books_and_library;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
