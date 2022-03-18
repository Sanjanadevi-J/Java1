import java.util.*;
class Book implements Comparable<Book>{
    int bookId, publishedYear;
    String bookName, authorName;

    Book(int bookId, int publishedYear, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishedYear = publishedYear;

    }
    public int compareTo(Book b) {
        if (bookId> b.bookId) {
            return 1;
        } else if (bookId < b.bookId) {
            return -1;
        } else {
            return 0;
        }
    }
}
public class PriorityQueue1 {
    public static void main(String[]args){
        Queue<Book> books =new PriorityQueue<Book>();
        Book b1= new Book(105,2022,"ABC","William");
        Book b2=new Book(102,2021,"XYZ","Gen");
        Book b3 = new Book(107,2020,"MNO","John");
        books.add(b1);
        books.add(b2);
        books.add(b3);
        System.out.println("book details:");
        for (Book b:books) {
            System.out.println("BookId-"+b.bookId+",published year-"+b.publishedYear+",book name-"+b.bookName+",authorname-"+b.authorName);
        }
        books.remove();
        System.out.println("book details after removing:");
        for (Book b:books) {
            System.out.println("BookId-"+b.bookId+",published year-"+b.publishedYear+",book name-"+b.bookName+",authorname-"+b.authorName);
        }
        books.peek();
        System.out.println("book details after retrieve:");
        for (Book b:books) {
            System.out.println("BookId-"+b.bookId+",published year-"+b.publishedYear+",book name-"+b.bookName+",authorname-"+b.authorName);
        }

    }
}
