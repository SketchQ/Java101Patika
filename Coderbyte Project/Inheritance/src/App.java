import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        int id = scanner.nextInt();
        int numScores = scanner.nextInt();
        int[] scores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            scores[i] = scanner.nextInt();
        }
        scanner.close();

        Student s = new Student(firstName, lastName, id, scores);
        System.out.println(s.printPerson());
        System.out.println("Grade: " + s.calculate());
       
    }
}
