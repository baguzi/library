import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class loadData {

    public static List<book> load(String filename) {

        List<book> books = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;
            boolean header = true;

            while ((line = br.readLine()) != null) {

                if (header) {
                    header = false;
                    continue;
                }


                books.add(book.fromCsv(line));
            }

            System.out.println("CSV 로드 완료.");

        } catch (Exception e) {
            System.out.println("CSV 파일 없음 → 기본값 사용");
        }

        return books;
    }
}
