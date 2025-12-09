public class book {

    int id;
    String name;
    String writer;
    String status;

    public book(int id, String name, String writer, String status) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.status = status;
    }


    public String toCsv() {
        return id + "," + name + "," + writer + "," + status;
    }


    public static book fromCsv(String line) {
        String[] data = line.split(",");
        return new book(
                Integer.parseInt(data[0]),
                data[1],
                data[2],
                data[3]
        );
    }

    public void printInfo() {
        System.out.println("도서번호:" + id + " | 도서이름:" + name + " | 저자:" + writer + " | 반납여부:" + status);
    }
}
