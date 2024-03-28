package hu.webler;

import hu.webler.bootstrap.DataLoader;
import hu.webler.service.BookService;

public class BookApp {

    public static void main(String[] args) {
        new DataLoader(new BookService()).loadData();
    }
}
