package Practice;

public class Course {
    // Variables
    String name;
    String code;
    String prefix;
    int note;
    int oralExam;
    // Ürettiğimiz sınıftan nesne alabiliriz. Sınıflar birbirinin niteliği olabilir
    Teacher teacher;

    // Constructor
    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = 0;
        this.oralExam = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve Ders Bölümleri uyuşmuyor!");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }
}
