import java.util.Scanner;

public class addBooksystem {

    Scanner sc = new Scanner(System.in);

    public book[] addBook(book[] books) {

        System.out.print("도서 번호: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 이름: ");
        String name = sc.nextLine();

        System.out.print("저자: ");
        String writer = sc.nextLine();

        System.out.print("대출/반납: ");
        String status = sc.nextLine();


        book[] newBooks = new book[books.length + 1];


        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }


        newBooks[books.length] = new book(id, name, writer, status);


        return newBooks;
    }
}
