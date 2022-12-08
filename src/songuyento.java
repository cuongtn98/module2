import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        System.out.println("nhap so :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Boolean check = true;
        if (number < 2) {
            System.out.println(number + " khum fai so NT");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false ;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " so nguyen to");
            } else {
                System.out.println(number + " khum fai so NT");
            }
        }

    }
}

