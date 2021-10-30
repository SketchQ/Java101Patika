package HomeWork;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            double tax = 0.0;
            return tax;
        } else {
            double tax = (this.salary * 3) / 100;
            return tax;
        }
    }

    public double bonus() {
        double bonus = 0.0;
        if (this.workHours > 40) {
            int bonusHours = workHours - 40;
            for (int i = 1; i <= bonusHours; i++) {
                bonus += 30;
            }
            return bonus;
        } else {
            return bonus;
        }
    }

    public double raiseSalary(){
        double raiseSalary = 0.0;
        if(this.hireYear >= 2011){
            raiseSalary = (this.salary * 5) / 100;
            return raiseSalary;
        }else if(this.hireYear < 2011 && this.salary >= 2001){
            raiseSalary = (this.salary * 10) /100;
            return raiseSalary;
        }else{
            raiseSalary = (this.salary * 15) / 100;
            return raiseSalary;
        }
    }

    public void print() {
        System.out.println("========================");
        System.out.println("Adı \t\t: " + this.name);
        System.out.println("Maaşı \t\t: " + this.salary);
        System.out.println("Çalışma Saati \t: " + this.workHours);
        System.out.println("Başlangıç Yılı \t: " + this.hireYear);
        System.out.println("Vergi \t\t: " + tax());
        System.out.println("Bonus \t\t: " + bonus());
        System.out.println("Maaş Artışı \t: " + raiseSalary());
        double totalRaise = tax() + raiseSalary() + bonus();
        System.out.println("Vergi ve Bonuslar ile birlikte alınan maaş : " + totalRaise);
        System.out.println("Toplam Maaş \t: " + (this.salary + totalRaise));
    }
}
