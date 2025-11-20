public class book {

        int id ;
        String name ;
        String writer ;
        boolean isReturned ;



        public book(int id , String name , String writer , boolean isReturned)
        {
            this.id = id ;
            this.name = name ;
            this.writer = writer ;
            this.isReturned = isReturned ;
        }


        public void printInfo(){
            System.out.println("도서번호: " + id);
            System.out.println("도서이름:" + name);
            System.out.println("저자:"+ writer);
            System.out.println("반납여부:" + isReturned);
        }


    }

