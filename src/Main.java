import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        searchSystem search_Book = new searchSystem();
        returnSystem return_Book = new returnSystem();
        addBooksystem add_Book = new addBooksystem();
        Scanner sc = new Scanner(System.in);
        book book1 = new book(475 , "미생물리학" , "김병홍","대출");
        book book2 = new book(530 , "재료공학", "김암수", "반납");
        book book3 = new book(531 , "그림과 나" , "김선현","대출");
        book book4 = new book(811 , "시가되는 순간" , "김세환","반납");

        book[] books = { book1, book2, book3, book4 };


        while (true) {

            System.out.println("1.도서저장");
            System.out.println("2.도서검색");
            System.out.println("3.도서반납");
            System.out.println("4. 종료 ");
            System.out.println("메뉴를 선택하세요:");

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


