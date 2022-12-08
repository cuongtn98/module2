import java.util.Scanner;

public class RecTangLe {
    double width , height;

    public RecTangLe() {

    }
public RecTangLe(double width , double height) {
        this.width = width;
        this.height = height;
}
public double Area() {
    return (this.width * this.height);
}
public double Perimeter() {
        return (this.width + this.height)*2;
}
public String display() {
        return "RecTangLe = "+"width = " + width + ",Height = "+ height+"";
        }

    public static void main(String[] args) {
        System.out.println("enter Width");
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        System.out.println("enter Height");
        Scanner scanner1 = new Scanner(System.in);
        double height = scanner1.nextDouble();

        RecTangLe recTangLe = new RecTangLe(width,height);
        System.out.println(recTangLe.display());
        System.out.println("dien tic la " +recTangLe.Area());
        System.out.println("chu vi la " +recTangLe.Perimeter());
    }
}
