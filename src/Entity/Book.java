package Entity;

import java.util.Arrays;

public class Book {
    private String bookName;
    private Author[] authors;
    int publisedYear;
    int quantity;

    public Book() {
        authors = new Author[0];
    }

    public String bookName() {
        return bookName;
    }

    public Book setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public Author[] authors() {
        return authors;
    }

    public Book setAuthors(Author[] authors) {
        this.authors = authors;
        return this;
    }
public void  addAuthor(Author author){
    Author[] newAuthors = Arrays.copyOf(authors, authors.length+1); //Скопировать autrhors в newAuthors, где на одну ячейку больше
    newAuthors[newAuthors.length-1] = author; //Добавить в эту ячейку author из параметра метода
    authors = newAuthors; //Скопировать ссылку newAuthors в authors
}
    public int publisedYear() {
        return publisedYear;
    }

    public Book setPublisedYear(int publisedYear) {
        this.publisedYear = publisedYear;
        return this;
    }

    public int quantity() {
        return quantity;
    }

    public Book setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public String toString() {
        return "Book{"
                + "bookName='" + bookName + '\''
                + ", authors=" + Arrays.toString(authors)
                + ", publisedYear=" + publisedYear
                + ", quantity=" + quantity
                + '}';
    }
}
