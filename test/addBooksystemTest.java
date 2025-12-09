import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SaveLoadTest {

    // 테스트 중에만 사용할 임시 파일명
    private static final String TEST_FILENAME = "test_library.csv";
    private List<book> testBooks;

    @BeforeEach
    void setUp() {
        // 모든 테스트 시작 전, 더미 데이터 2개 준비
        testBooks = new ArrayList<>();
        testBooks.add(new book(101, "테스트책1", "저자1", "대출"));
        testBooks.add(new book(102, "테스트책2", "저자2", "반납"));
    }

    @AfterEach
    void tearDown() {
        // 테스트가 끝나면 생성된 파일 삭제 (청소)
        File file = new File(TEST_FILENAME);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void SaveCsv() throws IOException {
        // 1. [실행] saveData를 이용해 파일 저장
        saveData.save(testBooks, TEST_FILENAME);

        // 2. [검증] 파일이 실제로 생성되었는지 확인
        File file = new File(TEST_FILENAME);
        assertTrue(file.exists(), "save 메서드 실행 후 파일이 생성되어야 합니다.");

        // 3. [검증] 파일 내용을 직접 읽어서 형식이 맞는지 확인
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String header = br.readLine(); // 첫 줄: 헤더
            String line1 = br.readLine();  // 둘째 줄: 데이터1
            String line2 = br.readLine();  // 셋째 줄: 데이터2

            // 헤더 검증
            assertEquals("ID,Name,Writer,Status", header);

            // 데이터 내용 검증 (book.toCsv() 결과와 일치 여부)
            assertEquals("101,테스트책1,저자1,대출", line1);
            assertEquals("102,테스트책2,저자2,반납", line2);
        }
    }

    @Test
    void SaveLoad() {
        // 1. [실행] 현재 데이터를 파일로 저장
        saveData.save(testBooks, TEST_FILENAME);

        // 2. [실행] 방금 저장한 파일을 다시 불러오기
        List<book> loadedBooks = loadData.load(TEST_FILENAME);

        // 3. [검증] 저장했던 데이터와 불러온 데이터가 정확히 일치하는지 확인
        assertNotNull(loadedBooks);
        assertEquals(testBooks.size(), loadedBooks.size(), "저장된 개수와 불러온 개수가 같아야 합니다.");

        // 첫 번째 책 정보 비교
        book original = testBooks.get(0);
        book loaded = loadedBooks.get(0);

        assertEquals(original.id, loaded.id);
        assertEquals(original.name, loaded.name);
        assertEquals(original.writer, loaded.writer);
        assertEquals(original.status, loaded.status);
    }
}