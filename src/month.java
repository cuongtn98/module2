import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap thang :");
        int month = scanner.nextInt();
        String DaysInMonth;
        switch (month) {
            case 2:
                DaysInMonth = "28";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                DaysInMonth = "co 31 ngay";
                break;
            case 10:
            case 4:
            case 6:
            case 9:
            case 11:
              DaysInMonth = "co 30 ngay";
                break;
            default:
                DaysInMonth = "";
        }
        if (!DaysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, DaysInMonth);
        else System.out.print("Invalid input!");
    }
}
