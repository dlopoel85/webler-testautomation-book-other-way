package hu.webler.bootstrap;

import hu.webler.model.Book;
import hu.webler.service.BookServiceI;
import hu.webler.util.FileHandler;
import hu.webler.util.Printer;

import java.util.List;

public class DataLoader {

    private static final String FILE_PATH = "src/main/resources/book_other.txt";
    private List<Book> books = FileHandler.readFileFromTxt(FILE_PATH);
    private final BookServiceI bookService;

    public DataLoader(BookServiceI bookService) {
        this.bookService = bookService;
    }

    public void loadData() {
        Printer.printList(books);
        System.out.println("----------------------------------------------");
    }

    public List<Book> deleteData() {
        Book bookToDelete = new Book("Gyilkosság az Orient expresszen", 0, "Helikon Kiadó",
                2020, "AC-1979", List.of("Agatha Christie"));
        return bookService.deleteBook(bookToDelete, getBooks());
    }

    public List<Book> addData() {
        Book bookToAdd = new Book("Gyilkosság az Orient expresszen", 0, "Helikon Kiadó",
                2020, "AC-1979", List.of("Agatha Christie"));
        return bookService.addBook(bookToAdd, getBooks());
    }

    public List<Book> modifyData() {
        Book bookToModify = new Book("Gyilkosság az Orient expresszen", 0, "Helikon Kiadó",
                2020, "AC-1979", List.of("Agatha Christie"));
        Book bookModification = new Book("Gyilkosság az Orient expresszen", 1, "Helikon Kiadó",
                2020, "AC-1979", List.of("Agatha Christie"));
        return bookService.modifyBook(bookToModify, bookModification, getBooks());
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
