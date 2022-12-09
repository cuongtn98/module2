public class CarNumber {
    public String name;
    public String engine;

    public static int NumberOfCars;

    public CarNumber(String name , String engine) {
        this.name = name;
        this.engine = engine ;
        NumberOfCars++ ;
    }
void display() {
    System.out.println(name + " " + engine);
}
    public static void main(String[] args) {
        CarNumber Car1 = new CarNumber("masachuset", "12k ma luc");
        CarNumber Car2 = new CarNumber("winx", "1k2 ma luc");
        CarNumber Car3 = new CarNumber("honda", "1k1 ma luc");
        CarNumber Car4 = new CarNumber("yamaha", "1k6 ma luc");
        Car1.display();
        Car2.display();
        Car3.display();
        Car4.display();

    }
}
