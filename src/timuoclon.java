import java.util.Scanner;

public class timuoclon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a : ");
        int number = scanner.nextInt();
        System.out.println("nhap so b :");
        int number2 =scanner.nextInt();
        number = Math.abs(number);
        number2 = Math.abs(number2);
        if (number == 0 || number2 == 0) {
                System.out.println("no greatest common factor");
        }
        while (number != number2) {

            if (number > number2 ) {
                number = number - number2 ;
            } else {
                number2 = number2 - number ;
            }

        }
        System.out.println("Greatest common factor: " + number);
    }
}
