import java.util.Scanner;

public class gtln {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap do dia cua mang : ");
            size = scanner.nextInt();
            if (size > 8) {
                System.out.println("gia tri nhap phai nho hon 8 phan tu ");
            }
        } while (size > 8);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhap phan tu" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        int maxarr = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {

            if (array[j] > maxarr) {
                maxarr = array[j];
                index = j + 1;
            }
        }
        System.out.println("gia tri lon nhat : " + maxarr + " vi tri so : " + index);
    }
}