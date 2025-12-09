import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class searchSystemTest {

    @Test
    void searchTest() {
        String input = "475\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        book book1 = new book(475 , "미생물리학" , "김병홍","대출");
        List<book> books = new ArrayList<>();
        books.add(book1);

        searchSystem system = new searchSystem();
        system.searchBook(books);

        String correctOutput = "도서번호:475 | 도서이름:미생물리학 | 저자:김병홍 | 반납여부:대출";

        assertTrue(output.toString().contains(correctOutput));
    }
}