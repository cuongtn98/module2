import java.util.Scanner;

public class PhuongTrinhBacHai {
    private final int a;
    private final int b;
    private final int c ;
public PhuongTrinhBacHai(int a , int b ,int c) {
    this.a = a ;
    this.b = b;
    this.c = c;
}
    public int getDiscriminant() {
        return (b * 2 -4 * ( a * c ));
    }
public double  getRoot1() {
    double r1 = (-b + (b*b - 4*a*c))/2*a;
    return r1;
}
public double  getRoot2() {
    return (-b - (b*b - 4*a*c))/2*a;
}
    public static void main(String[] args) {
        System.out.println("nhap gia tri a :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("nhap gia tri b : ");
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();
        System.out.println("nhap gia tri c ");
        Scanner scanner2 = new Scanner(System.in);
        int c = scanner2.nextInt();
        PhuongTrinhBacHai phuongTrinhBacHai = new PhuongTrinhBacHai(a, b, c);
        if (phuongTrinhBacHai.getDiscriminant() != 0) {
            System.out.println("r1 la : " + phuongTrinhBacHai.getRoot1());
            System.out.println("r2 la : " + phuongTrinhBacHai.getRoot2());
        } else{
            System.out.println("co 1 ngiem la :" +phuongTrinhBacHai.getRoot2() );
        }
    }
}
