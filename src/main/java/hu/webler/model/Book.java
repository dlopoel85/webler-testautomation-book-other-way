package hu.webler.model;

import hu.webler.value.Category;

import java.util.List;

public class Book {

    private static int counter = 0;
    private String title;
    private String category;
    private String publisher;
    private int publicationYear;
    private String articleNumber;
    private boolean isOnStock;
    private List<String> authors;

    public Book() {
        counter++;
    }

    public Book(String title, int categoryNumber, String publisher,
                int publicationYear, String articleNumber, List<String> authors) {
        this();
        this.title = title;
        this.category = mapCategory(categoryNumber).getHUNGARIAN_NAME();
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.articleNumber = articleNumber;
        this.isOnStock = isOnStock(articleNumber);
        this.authors = authors;
    }

    private boolean isOnStock(String articleNumber) {
        return !articleNumber.endsWith("*");
    }

    private Category mapCategory(int categoryNumber) {
        if (categoryNumber == 1) {
            return Category.NOVEL;
        } else if (categoryNumber == 2) {
            return Category.NON_FICTION;
        } else if (categoryNumber == 3) {
            return Category.FAIRY_TALE;
        } else if (categoryNumber == 4) {
            return Category.ADVENTURE_NOVEL;
        } else if (categoryNumber == 5) {
            return Category.ROMANTIC;
        } else if (categoryNumber == 6) {
            return Category.YOUTH_NON_FICTION;
        } else if (categoryNumber == 7) {
            return Category.YOUTH_NOVEL;
        } else if (categoryNumber == 8) {
            return Category.SCIENCE_FICTION;
        } else if (categoryNumber == 9) {
            return Category.AUTOBIOGRAPHY;
        } else if (categoryNumber == 10) {
            return Category.CRIME;
        } else {
            return Category.UNKNOWN;
        }
    }
    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Book.counter = counter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public boolean isOnStock() {
        return isOnStock;
    }

    public void setOnStock(boolean onStock) {
        isOnStock = onStock;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", category=" + category +
                ", publisher='" + publisher + '\'' +
                ", publicationYear=" + publicationYear +
                ", articleNumber='" + articleNumber + '\'' +
                ", isOnStock=" + isOnStock +
                ", authors=" + authors +
                '}';
    }
}
