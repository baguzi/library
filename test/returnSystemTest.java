import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class returnSystemTest {

    @Test
    void returnTest() {
        String input = "475\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));


        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));


        book[] book1 = { new book(475, "미생물리학", "김병홍", "대출") };


        returnSystem system = new returnSystem();
        system.returnBook(book1);

        assertTrue(output.toString().contains("도서가 반납되었습니다."));
    }
}