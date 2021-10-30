package Practice;

public class Student {
    // Nitelikler
    String name;
    String stuNo;
    String classes;
    // Diğer sınıflardan nitelik alma
    Course c1;
    Course c2;
    Course c3;
    // Devam
    double avarage;
    boolean isPass;

    // Constructor
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void printNote(){
        System.out.println(c1.name + " notu\t:" + c1.note);
        System.out.println(c2.name + " notu\t:" + c2.note);
        System.out.println(c3.name + " notu\t:" + c3.note);
        System.out.println("Ortalamanız \t: " + this.avarage);
    }

    void isPass(){
        this.avarage = (this.c1.note + this.c2.note+this.c3.note) / 3;
        if(this.avarage > 55){
            System.out.println("Sınıfı Başarılı şekilde geçtiniz.");
        }else{
            System.out.println("Sınıfı geçemediniz.");
        }
    }
}
