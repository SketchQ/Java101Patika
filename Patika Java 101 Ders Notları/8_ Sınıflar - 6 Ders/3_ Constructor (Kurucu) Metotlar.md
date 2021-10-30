# Constructor (Kurucu) Metotlar

Kurucu metotlar sınıflar tasarlanırken yazılırlar. Sınıfınızı yazarken kurucu metotlarınızı da tanımlayabilirsiniz. Eğer sınıf içinde hiç kurucu metot tanımlamazsanız parametresiz boş bir kurucu Java tarafından otomatik olarak tanımlanır.

Kurucu metotların isimleri Sınıf ismiyle aynı olmak zorundadır. Ancak dönüş tipi yazılmasına gerek yoktur.

"**new**" keyword ile nesne üretilirken constructor method çağırılır. İki tip kurucu metot vardır:

* Parametresiz Default Kurucu Metot

* Parametreli kurucu Metot

Car Sınıfımız:

```java
public class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;

    // Constructor (Kurucu) Metot
    Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    // davranışlar
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed() {
        System.out.println("Speed : " + speed);
    }

    void printInfo() {
        System.out.println("================");
        System.out.println("Model  : " + this.model);
        System.out.println("Color  : " + this.color);
        System.out.println("Type  : " + this.type);
        System.out.println("Speed  : " + this.speed);
    }
    // ...
}
```

Nesnelerimiz:

```java
public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Sports", "Audi", "red");
        audi.increaseSpeed(20);
        audi.printInfo();

        Car bmw = new Car("Sports" , "BMW" , "blue");
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printInfo();

        Car mercedes = new Car("Corporate" , "Mercedes" , "black");
        mercedes.speed = 20;
        mercedes.printInfo();

    }
}
```

Program çıktısı:

```txt
================
Model  : Audi
Color  : red
Type  : Sports
Speed  : 20
================
Model  : BMW
Color  : blue
Type  : Sports
Speed  : 15
================
Model  : Mercedes
Color  : black
Type  : Corporate
Speed  : 20
```

## Kaynak

[Patika](https://app.patika.dev/moduller/java101/constructor)
