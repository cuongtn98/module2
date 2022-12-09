public class TestCircle {
    private double radius = 0.1;
    private String color = "red";

    public TestCircle() {

    }

    public TestCircle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double Area() {
        double area = radius * radius * 3.14134578;
        return area;
    }

    public static void main(String[] args) {    
        TestCircle testCircle = new TestCircle(5);
        System.out.println(testCircle.Area());
    }
}
