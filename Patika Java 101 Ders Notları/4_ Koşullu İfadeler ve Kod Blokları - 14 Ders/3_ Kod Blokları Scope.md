# Kod Blokları (Scope)

İki küme parantezi “{“ ve “}” arasında kalan kod kesimine blok (scope) denir. “{“ işareti bir kod bloğu başlatır ve “}” işareti başlatılan kod bloğunu bitirir. Bu işaretler kodun sınırlarını belirlemekte kullanılır. Herhangi bir değişken, tanımlandığı kod bloğu içinde fiziksel olarak vardır ve o kod bloğu içine yazılan kod kesimlerinden erişilebilirdir. Bir blok içinde aynı değişken adı birden fazla kez kullanılamaz.

```java
public class JavaPatika{
    // JavaPatika sınıfına ait alan

    public static void main(String[] args){
        // Main Metoduna ait alan
        System.out.println("Burası main metota ait");
    }
}
```

## Kötü Kod Örneği

```java
public class JavaPatika{
// JavaPatika sınıfına ait alan
public static void main(String[] args){
// Main metoda ait alan
int = a=1,b=2,c=3;
System.out.println("Burası main metota ait");
}
}
```

## Temiz Kod Örneği

```java
public class JavaPatika{
    // JavaPatika Sınıfına ait alan
    public static void main(String[] args){
        // Main metoduna ait alan
        int a = 1, b = 2, c = 3;
        System.out.println("Main Metotuna ait alan");
    }
}
```

### Kaynak

> [Scope](https://app.patika.dev/moduller/java101/scope)
