import java.util.Scanner;

public class searchSystem{
    Scanner sc = new Scanner(System.in);
    public void searchBook(book[] books) {

        System.out.print("검색할 도서 번호 입력: ");
        int id = sc.nextInt();

        for (int i = 0; i < books.length; i++) {
            if (books[i].id == id) {
                books[i].printInfo();

                break;
            }
        }


    }
}