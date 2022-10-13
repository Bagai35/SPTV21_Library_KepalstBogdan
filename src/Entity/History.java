package Entity;

import java.util.Date;

public class History {
    Book book;
    Reader reader;
    Date takeOnBook;
    Date returnBook;

    public History() {
    }

    public Book book() {
        return book;
    }

    public History setBook(Book book) {
        this.book = book;
        return this;
    }

    public Reader reader() {
        return reader;
    }

    public History setReader(Reader reader) {
        this.reader = reader;
        return this;
    }

    public Date takeOnBook() {
        return takeOnBook;
    }

    public History setTakeOnBook(Date takeOnBook) {
        this.takeOnBook = takeOnBook;
        return this;
    }

    public Date returnBook() {
        return returnBook;
    }

    public History setReturnBook(Date returnBook) {
        this.returnBook = returnBook;
        return this;
    }

    @Override
    public String toString() {
        return "History{"
                + "book=" + book
                + ", reader=" + reader
                + ", takeOnBook=" + takeOnBook
                + ", returnBook=" + returnBook
                + '}';
    }
}
