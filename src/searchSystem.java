import java.util.List;
import java.util.Scanner;

public class searchSystem {

    Scanner sc = new Scanner(System.in);

    public void searchBook(List<book> books) {

        System.out.print("검색할 도서 번호 입력: ");
        int id = sc.nextInt();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).id == id) {
                books.get(i).printInfo();
                break;
            }
        }
    }
}
