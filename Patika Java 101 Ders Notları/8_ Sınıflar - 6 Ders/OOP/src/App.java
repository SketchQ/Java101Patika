package src;

public class App {
    public static void main(String[] args) throws Exception {
        Car audi = new Car();
        audi.speed = 10;
        System.out.println("Audi Hızı : " + audi.speed);
        Car r8 = new Car("Sports", "Audi", "Red");
        r8.printInfo();
        Car bmw = new Car();
        bmw.speed = 25;
        System.out.println("BMW Hızı : " + bmw.speed);
        Car m3 = new Car("Sports","BMW","Blue");
        m3.printInfo();
        Car mercedes = new Car();
        mercedes.speed = 30;
        System.out.println("Mercedes Hızı : " + mercedes.speed);
        Car s9000 = new Car("Corporate","Mercedes","Black");
        s9000.printInfo();
    }
}
