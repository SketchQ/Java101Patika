package Boks;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkweight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("=========== New Round!! ==============");
                if(f1.coinToss()){
                    System.out.println("Tura Atışını kazanan : " + this.f1.name);
                    f2.health = f1.hit(f2);
                }else{
                    System.out.println("Tura atışını kazanan : " + this.f2.name);
                    f1.health = f2.hit(f1);
                }
                //f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }
                //f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor!");
        }
    }

    public boolean checkweight() {
        return ((f1.weight >= this.minWeight && f1.weight <= this.maxWeight) && (f2.weight >= this.minWeight && f2.weight <= this.maxWeight));
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçın kazananı \t: " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçın Kazananı \t: " + f1.name);
            return true;
        } else {
            return false;
        }
    }

    public void printScore() {
        System.out.println("=============");
        System.out.println(f1.name + " Kalan Can \t: " + f1.health);
        System.out.println(f2.name + " Kalan Can \t: " + f2.health);
    }
}
