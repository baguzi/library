import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        searchSystem search_Book = new searchSystem();
        returnSystem return_Book = new returnSystem();
        addBooksystem add_Book = new addBooksystem();
        Scanner sc = new Scanner(System.in);

        List<book> books = new ArrayList<>();

        books.add(new book(475, "미생물리학", "김병홍", "대출"));
        books.add(new book(530, "재료공학", "김암수", "반납"));
        books.add(new book(531, "그림과 나", "김선현", "대출"));
        books.add(new book(811, "시가되는 순간", "김세환", "반납"));

        while (true) {

            System.out.println("1. 도서저장");
            System.out.println("2. 도서검색");
            System.out.println("3. 도서반납");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int num = sc.nextInt();

            if (num == 1) {
                books = add_Book.addBook(books);
                System.out.println("도서가 추가되었습니다.\n");
            }

            if (num == 2) {
                search_Book.searchBook(books);
            }

            if (num == 3) {
                return_Book.returnBook(books);
            }

            if (num == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
