import java.util.Scanner;

public class SNT {
    public static void main(String[] args) {
        System.out.println("nhap so :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i ==0) {
                System.out.println("ko la SNT");
            }
            else if (count <= 20){
                System.out.println("a là số nguyên tố");
                count++;
            }

        }
    }
}
