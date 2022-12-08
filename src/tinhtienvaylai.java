import java.util.Scanner;

public class tinhtienvaylai {
    public static void main(String[] args) {
        System.out.println("nhap so thang :");
        Scanner scanner = new Scanner(System.in);
        double month = scanner.nextDouble();
        System.out.println("nhap so tien :");
        Scanner monney = new Scanner(System.in);
        double tien = scanner.nextDouble();
System.out.println("so tien la"+ tien * (12/100)/12 * month);
    }
}
