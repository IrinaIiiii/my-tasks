package task4;

import java.util.*;

public class Library {
    private Map<Book,String> map = new HashMap<>();

    public void addBook(String name, String autor, int year, String place) {
        Book book = new Book(name, autor,year);
        map.put(book,place);
    }

    public void deleteBook(Book book) {
        map.remove(book);
    }

    public String getPlaceBook(String name, String autor, int year) {
        Book book = new Book(name, autor,year);
        return map.get(book);
    }

    public void replaceBook(String name, String autor, int year, String place) {
        Book book = new Book(name, autor,year);
        if (map.containsKey(book)) {
            map.put(book, place);
        }
    }

    public List<Book> getListBookByAutor(String autor) {
        List<Book> bookList = new ArrayList<>();

        Set<Book> set = map.keySet();
        for (Book book: set) {
            if (book.getAutor().equals(autor)) {
                bookList.add(book);
            }
        }
        return bookList;
    }
}
