import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class returnSystemTest {

    @Test
    void returnTest() {
        String input = "475\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        List<book> books = new ArrayList<>();
        books.add(new book(475, "미생물리학", "김병홍", "대출"));

        returnSystem system = new returnSystem();
        system.returnBook(books);

        assertTrue(output.toString().contains("도서가 반납되었습니다."));
    }
}