package sptv21Library;

import Entity.Author;
import Entity.Book;
import Entity.History;
import Entity.Reader;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class App {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        Book book = null;
        Reader reader = null;
        History history = null;
        do{
            System.out.println("задачи:");
            System.out.println("0. Выключить программу");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить читателя");
            System.out.println("3. Выдать книгу");
            System.out.println("Выберите задачу");

            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить книгу");
                    book = createBook("Война и мир", 3, 1956);
                    book.addAuthor(createAuthor("Лев", "Толстой", 1828));
                    System.out.println(book);
                    break;
                case 2:
                    System.out.println("2. Добавить читателя");
                    reader = new Reader();
                    reader.setFirstname("Иван");
                    reader.setLastname("Иванов");
                    reader.setPhone("5656565656");
                    System.out.println(reader);
                case 3:
                    System.out.println("3. Выдать книгу");
                    history = new History();
                    history.setBook(book);
                    history.setReader(reader);
                    history.setTakeOnBook(new GregorianCalendar().getTime());
                    System.out.println(history);
                case 4:
                    System.out.println("4. Забрать книгу");
                    history.setReturnBook(new GregorianCalendar().getTime());
                    System.out.println(history);

                default:
                    System.out.println("Выберите задачц из списка");

            }

        }while (repeat);
        System.out.println("Закрытие программы, бб:)");

    }
    public Book createBook(String bookName, int quantity, int publishedYear){
        Book book = new Book();
        book.setBookName(bookName);
        book.setPublisedYear(publishedYear);
        book.setQuantity(quantity);
        return book;
    }
    public Author createAuthor(String firstname, String lastname, int birthday){
        Author author = new Author();
        author.setBirthday(birthday);
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;

    }

}
