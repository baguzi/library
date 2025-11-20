import java.util.Scanner;
import java.util.ArrayList;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        book book1 = new book(475 , "미생물리학" , "김병홍",true);
        book book2 = new book(530 , "재료공학", "김암수", true);
        book book3 = new book(530 , "그림과 나" , "김선현",true);
        book book4 = new book(811 , "시가되는 순간" , "김세환",true);

        book[] books = { book1, book2, book3, book4 };
        num = sc.nextInt();

        while (true){
            System.out.println("1.도서저장");
            System.out.println("2.도서검색");
            System.out.println("3.도서반납");
            System.out.println("4. 종료 ");
            System.out.println("메뉴를 선택하세요:");

            if(num == 1);


        }


    }
}