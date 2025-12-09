import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class saveData {

    public static void save(List<book> books, String filename) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {


            bw.write("ID,Name,Writer,Status");
            bw.newLine();


            for (book b : books) {
                bw.write(b.toCsv());
                bw.newLine();
            }

            System.out.println("파일 저장 완료.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
