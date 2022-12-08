import java.util.Scanner;

public class timtentrongmang {
    public static void main(String[] args) {
        String[] listStudents = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily" };
        System.out.println("nhap ten hs : ");
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < listStudents.length; i++) {
            if (listStudents[i].equals(stringInput)) {
                System.out.println("hoc sinh "+ stringInput + "  co stt " +i);
                isExit = true ;
                break;
            }
        }
        if (!isExit) {
            System.out.println("ko tim thay gia tri" + stringInput + "trong danh sach");
        }
    }
}
