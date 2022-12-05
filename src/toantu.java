import java.util.Scanner;

public class toantu {
    public static void main(String[] args) {
        float with;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap with");
        with = scanner.nextFloat();
        System.out.println("nhap height");
        height = scanner.nextFloat();
        float area = with * height ;
        System.out.println(area);
    }
}

