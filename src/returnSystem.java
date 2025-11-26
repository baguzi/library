import java.util.Scanner;

public class returnSystem {
    Scanner sc = new Scanner(System.in);

    public void returnBook(book[] books) {
        System.out.print("반납할 도서 번호 입력: ");
        int id = sc.nextInt();


        for (int i = 0; i < books.length; i++) {

            if (books[i].id == id) {

                if (books[i].status.equals("반납")) {
                    System.out.println("이미 반납된 도서입니다.");
                } else {
                    books[i].status = "반납" ;
                    System.out.println("도서가 반납되었습니다.");
                }

                break;
            }
        }


        }
    }
