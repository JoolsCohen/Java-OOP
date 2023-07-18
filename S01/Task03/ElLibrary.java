package Task03;

public class ElLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        Book book_1 = new Book("Мастер и Маргарита", "Булгаков Михаил Афанасьевич", true );
        Book book_2 = new Book("Братья Карамазовы", "Фёдор Михайлович Достоевский", true );
        Book book_3 = new Book("Алиса в стране Чудес", "Льюис Кэрол", true );
        Book book_4 = new Book();
        book_4.setAuthor("Артур Конан Дойл");
        book_4.setTitle("Собака Баскервилей");
        book_4.setAvailable(false);

        library.addBook(book_1);
        library.addBook(book_2);
        library.addBook(book_3);
        library.addBook(book_4);
        System.out.println();
        library.displayAvailableBooks();
        library.removeBook(book_1);
        library.searchByAuthor("булгаков михаил афанасьевич");
        library.displayAvailableBooks();
    }
}