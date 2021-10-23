package Classes;
public class SecondClass {
    
    static void show(){
        System.out.println("Show Metodu...");
        return;
    }

    // geridönüşü int olan toplama metotu
    static int sum(int a,int b){
        return a + b;
    }

    // Void geridönüşlü metot yazımı

    static void sumVoid(int x, int y){
        int result = x + y;
        System.out.println(result);
    }

    public static void main(String[] args) {
        // sum metotudunu çağırma
        int result = sum(5,2) + sum(3,1);
        System.out.println(result);
        // sumVoid metodunu çağırma
        sumVoid(5,2);    
        // show metotu çağırma
        show();
    }
}
