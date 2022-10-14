

package sptv21Library;

import Entity.Author;
import Entity.Book;
import Entity.History;
import Entity.Reader;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class App {
    private Book[] books;

    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        books = new Book[0];
        Reader reader = null;
        History history = null;
        do{
            System.out.println("Задачи: ");
            System.out.println("0. Закончить программу");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить читателя");
            System.out.println("3. Выдать книгу");
            System.out.println("4. Вернуть книгу");
            System.out.print("Выберите задачу: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить книгу");
                    System.out.println("Введите название книги: ");
                    String bookName = scanner.nextLine();
                    System.out.println("Введите год издания книги:");
                    String publishedYear = scanner.nextLine();
                    System.out.println("Введите колл-во экземпляров:");
                    String quantity = scanner.nextLine();
                    Book book = createBook(bookName, new Integer(quantity), Integer.parseInt(publishedYear));
                    System.out.println("Введите колл-во авторов книги: ");
                    int countAuthorsInBook = scanner.nextInt();scanner.nextLine();

                    for (int i = 0; i<countAuthorsInBook; i++){
                        System.out.println("Введите имя автора: "+(i+1)+": ");
                        String firstname = scanner.nextLine();
                        System.out.println("Введите фамилию автора: "+(i+1)+": ");
                        String lastname = scanner.nextLine();
                        System.out.println("Введите дату рождения автора: "+(i+1)+": ");
                        String birthday = scanner.nextLine();
                        book.addAuthor(createAuthor(firstname, lastname, Integer.parseInt(birthday)));
                    }

                    break;
                case 2:
                    System.out.println("2. Добавить читателя");
                    reader = new Reader();
                    reader.setFirstname("Ivan");
                    reader.setLastname("Ivanov");
                    reader.setPhone("5656565656");
                    break;
                case 3:
                    System.out.println("3. Выдать книгу");
                    history = new History();
                    history.setBook(book);
                    history.setReader(reader);
                    history.setTakeOnBook(new GregorianCalendar().getTime());
                    System.out.println(history);
                    break;
                case 4: 
                    System.out.println("4. Вернуть книгу");
                    history.setReturnBook(new GregorianCalendar().getTime());
                    System.out.println(history);
                    break;
                default:
                    System.out.println("Выберите задачу из списка!");;
            }
            
        }while(repeat);
        System.out.println("Закрытие программы, досвидания!");
    }
    public Book createBook(String bookName,int quantity, int publishedYear){
        Book book = new Book();
        book.setBookName(bookName);
        book.setPublishedYear(publishedYear);
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
