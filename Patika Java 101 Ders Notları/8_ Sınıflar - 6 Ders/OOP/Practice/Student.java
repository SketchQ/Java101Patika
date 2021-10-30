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
        System.out.println("===============");
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

    void addOralExamNote(int oral1, int oral2, int oral3){
        if(oral1 >= 0 && oral1 <= 100){
            this.c1.oralExam = oral1;
        }
        if(oral2 >= 0 && oral2 <= 100){
            this.c2.oralExam = oral2;
        }
        if(oral3 >= 0 && oral3 <= 100){
            this.c3.oralExam = oral3;
        }
    }
    void calcAverage(){
        double result = 0;
        result = ((this.c1.note * 0.80) + (this.c1.oralExam * 0.20));
        result += ((this.c2.note * 0.80) + (this.c2.oralExam * 0.20));
        result += ((this.c3.note * 0.80) + (this.c3.oralExam * 0.20));
        this.avarage = result / 3;
    }

    void printNote(){
        System.out.println(c1.name + " notu\t:" + c1.note);
        System.out.println(c2.name + " notu\t:" + c2.note);
        System.out.println(c3.name + " notu\t:" + c3.note);
        System.out.println(c1.name + " sözlü notu :" + c1.oralExam);
        System.out.println(c2.name + " sözlü notu :" + c2.oralExam);
        System.out.println(c3.name + " sözlü notu :" + c3.oralExam);
        System.out.println("Ortalamanız \t: " + this.avarage);
        if(this.isPass){
            System.out.println("Dersi Geçtiniz...");
        }else{
            System.out.println("Dersi Geçemediniz...");
        }
    }

    boolean isPass(){
        if(this.avarage >= 55){
            return this.isPass = true;
        }else{
            return isPass = false;
        }
    }

    void printStudentInfo(){
        System.out.println("Öğrenci adı  \t:"+ this.name + "\n"+ "Öğrenci No \t:" + this.stuNo);
    }
}
