package hu.webler.util;

import hu.webler.model.Book;

import java.util.List;

public class Printer {

    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void printBookList(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void printWordList(List<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    private Printer() {

    }
}
