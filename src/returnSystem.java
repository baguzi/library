import java.util.List;
import java.util.Scanner;

public class returnSystem {

    Scanner sc = new Scanner(System.in);

    public void returnBook(List<book> books) {

        System.out.print("반납할 도서 번호 입력: ");
        int id = sc.nextInt();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == id) {

                if (books.get(i).status.equals("반납")) {
                    System.out.println("이미 반납된 도서입니다.");
                } else {
                    books.get(i).status = "반납";
                    System.out.println("도서가 반납되었습니다.");
                }

                break;
            }
        }
    }
}
