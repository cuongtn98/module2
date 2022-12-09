public class StaticMethol  {
    private int rollno;
    private String name;
        private static String college = "BBDIT";
    StaticMethol(String n , int r) {
            rollno = r ;
            name = n ;
        }
        static void change() {
        college = "CODEGYM";
        }

    public static void setCollege(String college) {
        StaticMethol.college = college;


    }

    void display() {
            System.out.println(rollno + " " + name +" "+ college);
        }

    public static void main(String[] args) {
        StaticMethol.change();
        StaticMethol.setCollege("abc");
        StaticMethol s1 = new StaticMethol("hoang", 013);
        StaticMethol s2 = new StaticMethol("tran", 011);
        StaticMethol s3 = new StaticMethol("mai", 012);
        StaticMethol s4 = new StaticMethol("ha", 017);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
