package src;

public class App {
    public static void main(String[] args) throws Exception {
        Car audi = new Car();
        audi.speed = 10;
        System.out.println("Audi Hızı : " + audi.speed);

        System.out.println("-------");
        Car bmw = new Car();
        bmw.speed = 25;
        System.out.println("BMW Hızı : " + bmw.speed);

        System.out.println("-------");
        Car mercedes = new Car();
        mercedes.speed = 30;
        System.out.println("Mercedes Hızı : " + mercedes.speed);
        
    }
}
