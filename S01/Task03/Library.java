package Task03;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog = new ArrayList<Book>();

    public void addBook(Book book) {
        if (catalog.contains(book)) {
            System.out.println("Книга уже содержится в электронной библиотеке!");
        } else {
            if (book.getAvailable()) {
                catalog.add(book);
                System.out.println("Книга успешно добавлена в электронную библиотеку!");
            } else {
                System.out.println("Книга не доступна!");
            }

        }
    }

    public void removeBook(Book book) {
        if (catalog.contains(book)) {
            catalog.remove(book);
            System.out.println("Книга успешно удалена!");
        } else System.out.println("Такой книги нет в электронной библиотеке!");
    }

    public void displayAvailableBooks() {
        for (Book book : catalog) {
            System.out.println(book.displayInfo() + "\n");
        }
    }

    public void searchByAuthor(String author) {
        for (Book book : catalog) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book.displayInfo());
            } else System.out.println("Такого автора в электронной библиотеке не найдено!"); break;
        }

    }
}