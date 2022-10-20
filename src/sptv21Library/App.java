package sptv21Library;

import Entity.Author;
import Entity.Book;
import Entity.History;
import Entity.Reader;
import Manager.BookManager;
import Manager.ReaderManager;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class App {
    private final Scanner scanner;
    private Book[] books;
    private Reader[] readers;
    private History[] histories;
    private BookManager bookManager;
    private ReaderManager readerManager;

    public App() {
        scanner = new Scanner(System.in);
        books = new Book[0];
        readers = new Reader[0];
        histories = new History[0];
        bookManager = new BookManager();
        readerManager = new ReaderManager();
    }

    public void run() {
        boolean repeat = true;

        History history = null;
        do {
            System.out.println("Задачи: ");
            System.out.println("0. Закончить программу");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить читателя");
            System.out.println("3. Выдать книгу");
            System.out.println("4. Вернуть книгу");
            System.out.println("5. Список выданных книг");
            System.out.println("6. Список книг");
            System.out.println("7. Список читателей");
            System.out.println("8. Редактировать книгу");
            System.out.print("Выберите задачу: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить книгу");
                    bookManager = new BookManager();
                    bookManager.createBookWithAuthot();
                    this.books = Arrays.copyOf(this.books, this.books.length + 1);
                    this.books[this.books.length - 1] = bookManager.createBookWithAuthot();

                    break;
                case 2:
                    System.out.println("2. Добавление читателя");
                    this.readers = Arrays.copyOf(this.readers, this.readers.length + 1);
                    this.readers[this.readers.length - 1] = readerManager.createReader();
                    break;
                case 3:
                    System.out.println("3. Выдать книгу");
                    System.out.println("Список читателей: ");
                    for (int i = 0; i < readers.length; i++) {
                        System.out.println(i + 1 + ". " + readers[i].getFirstname() + " " + readers[i].getLastname());
                    }
                    System.out.print("Выбери читателя: ");
                    int numberReader = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Список книг: ");
                    for (int i = 0; i < books.length; i++) {
                        System.out.print(i + 1 + ". " + books[i].getBookName() + ". ");
                        for (int j = 0; j < books[i].getAuthors().length; j++) {
                            System.out.printf("%s %s %d",
                                    books[i].getAuthors()[j].getFirstname(),
                                    books[i].getAuthors()[j].getLastname(),
                                    books[i].getAuthors()[j].getBirthday());

                        }
                        System.out.println();
                    }
                    System.out.print("Выбери номер книги: ");
                    int numberBook = scanner.nextInt();
                    scanner.nextLine();
                    history = new History();
                    history.setBook(books[numberBook - 1]);
                    history.setReader(readers[numberReader - 1]);
                    history.setTakeOnBook(new GregorianCalendar().getTime());
                    this.histories = Arrays.copyOf(this.histories, this.histories.length + 1);
                    this.histories[this.histories.length - 1] = history;
                    System.out.println(history);
                    break;
//                case 4:
//                    System.out.println("4. Вернуть книгу");
//                    history.setReturnBook(new GregorianCalendar().getTime());
//                    System.out.println(history);
//                    break;
                case 5:
                    System.out.println("5. Список выданных книг");
                    for (int i = 0; i < histories.length; i++) {
                        if (histories[i].getReturnBook() == null) {
                            System.out.print(i + 1 + ". " + histories[i].getBook().getBookName() + ". ");
                            for (int j = 0; j < histories[i].getBook().getAuthors().length; j++) {
                                System.out.printf("%s %s %d",
                                        histories[i].getBook().getAuthors()[j].getFirstname(),
                                        histories[i].getBook().getAuthors()[j].getLastname(),
                                        histories[i].getBook().getAuthors()[j].getBirthday());

                            }
                            System.out.println();
                        }
                    }
                    break;
                case 6:
                    System.out.println("6. Список книг");
                    bookManager = new BookManager();
                    bookManager.printListBooks(books);
                    break;
                case 7:
                    System.out.println("7. Список читателей");
                    readerManager = new ReaderManager();
                    readerManager.printListReader(readers);
                    break;
                case 8:
                    System.out.println("8. Редактировать книгу");
                    this.books = bookManager.changeBook(books);
                    break;
                default:
                    System.out.println("Выберите задачу из списка!");
                    ;
            }

        } while (repeat);
        System.out.println("Закрытие программы, досвидания!");
    }
}




