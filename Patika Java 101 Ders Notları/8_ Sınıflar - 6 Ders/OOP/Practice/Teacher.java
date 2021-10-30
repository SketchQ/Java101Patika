package Practice;

public class Teacher {
    // Nitelikler (Variables)
    String name;
    String mpno;
    String branch;

    // Constructor
    Teacher(String name,String branch,String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefon : " + this.mpno);
        System.out.println("Bölümü : " + this.branch);
    }
}
