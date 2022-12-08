import java.util.Scanner;

public class ktrnam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap nam :");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0|| year % 400 == 0 && year % 100 == 0) {
            System.out.println("la nam nhuan");
        } else {
            System.out.println("ko la nam nhuan");
        }
    }
}