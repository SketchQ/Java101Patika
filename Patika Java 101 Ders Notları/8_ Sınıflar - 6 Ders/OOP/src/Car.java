package src;

public class Car {
    // Nitelikler
    String type;
    String model;
    String color;
    int speed;

    // Constructors (Kurucu) Metot
    Car(String type, String model, String color){
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
        System.out.println("Constructor with parametres used...");
        System.out.println("------");
    }

    Car(){
        System.out.println("Default Empty Consturctor used....");
        System.out.println("-----");
    }

    // Davranışlar
    int increaseSpeed(int increment){
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease){
        if(speed > 0 ){
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed(){
        System.out.println("Speed : " + speed);
    }

    void printInfo(){
        System.out.println("================");
        System.out.println("Model  : " + this.model);
        System.out.println("Color  : " + this.color);
        System.out.println("Type  : " + this.type);
        System.out.println("Speed  : " + this.speed);
    }
}
