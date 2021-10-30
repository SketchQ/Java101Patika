package Practice;

public class Main {
    public static void main(String[] args) {
        // Öğretmenler
        Teacher t1 = new Teacher("Mahmut", "TRH", "+90 500 00 00");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000 000");
        Teacher t3 = new Teacher("Mehmet Ali", "MTM", "522 222 33 44");
        // Dersler
        Course tarih = new Course("Tarih", "101", "TRH", t1);
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "104", "FZK", t2);
        fizik.addTeacher(t2);
        Course mat = new Course("Matematik", "102", "MTM", t3);
        mat.addTeacher(t3);
        // Öğrenciler
        Student s1 = new Student("İnek Şaban", "2125", "4.Sınıf", tarih, fizik, mat);
        s1.addBulkExamNote(100, 78, 50);
        s1.isPass();
        s1.printNote();
        Student s2 = new Student("Güdük Necmi", "2124", "4.Sınıf", tarih, fizik, mat);
        s2.addBulkExamNote(75, 80, 60);
        s2.isPass();
        s2.printNote();
    }
}
