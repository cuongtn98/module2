import java.util.Scanner;

public class caculation {
    public static void main(String[] args) {
        Scanner ipnut = new Scanner(System.in);
        double doc;
        double dof;
        int choice;
        do {
            System.out.println("BANG CHON");
            System.out.println("1.do c sang f");
            System.out.println("2.do f sang do c");
            System.out.println("0. thoat chuong trinh");
            System.out.println( "lua chon cua b");
            choice = ipnut.nextInt();
             switch (choice) {
                 case 1:
                     System.out.println("nhap  nhiet do F :");
                     dof = ipnut.nextDouble();
                     System.out.println("nhiet do c la : "+(5.0 / 9) * (dof - 32));

                     break;
                 case 2:
                     System.out.println("nhap nhiet do C");
                     doc = ipnut.nextDouble();
                     System.out.println("nhiet do F la "+(9.0 * 5)*(doc + 32) );
                     break;
                 case 0:
                    System.exit(0);
             }
        }while (true);
    }
}
