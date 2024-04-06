public class BooksMain {
    public static void main(String[] args) {
        Books book = new Books("java","jaslin");
        System.out.println("Author of the Book is " + book.Author);
        System.out.println("Genre of the Book is " + book.Genre);
        System.out.println("Price of the Book is " + book.Price);
        System.out.println("Name of the Book is " + book.Name);
        System.out.println("-------------------------------");

        Books book1 = new Books("cobol","vasu","technical" , 99.99);
        System.out.println("Author of the Book is " + book1.Author);
        System.out.println("Genre of the Book is " + book1.Genre);
        System.out.println("Price of the Book is " + book1.Price);
        System.out.println("Name of the Book is " + book1.Name);
        System.out.println("for git");
    }
}
