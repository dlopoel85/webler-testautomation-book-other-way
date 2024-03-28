package hu.webler.service;

import hu.webler.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService implements BookServiceI {

    @Override
    public List<Book> addBook(Book addBook, List<Book> existingBooks) {
        List<Book> resultList = new ArrayList<>(existingBooks);
        resultList.add(addBook);
        return resultList;
    }

    @Override
    public List<Book> deleteBook(Book bookToDelete, List<Book> existingBooks) {
        List<Book> resultList = new ArrayList<>(existingBooks);
        for (int i = 0; i < resultList.size(); i++) {
            if (resultList.get(i).equals(bookToDelete)) {
                resultList.remove(i);
                i--;
            }
        }
        return resultList;
    }

    @Override
    public List<Book> modifyBook(Book bookToModify, Book bookModification, List<Book> existingBooks) {
        List<Book> resultList = new ArrayList<>(existingBooks);
        for (int i = 0; i < resultList.size(); i++) {
            if (resultList.get(i).equals(bookToModify)) {
                resultList.set(i, bookModification);
            }
        }
        return resultList;
    }
}
