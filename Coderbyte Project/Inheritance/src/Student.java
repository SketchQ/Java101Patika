class Student {
    private int[] testScores;
    String firstName;
    String lastName;
    int idNumber;


    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.testScores = testScores;
    }

    public String printPerson(){
        return "Name: " + lastName + ", " + firstName + "\nID: " + idNumber;
    }
    
    char calculate(){
        int sum = 0;
        for(int i = 0; i < testScores.length; i++){
            sum += testScores[i];
        }
        sum = sum / testScores.length;
        if(sum >= 90 && sum <= 100){
            return 'O';
        }
        else if(sum >= 80 && sum < 90){
            return 'E';
        }
        else if(sum >= 70 && sum < 80){
            return 'A';
        }
        else if(sum >= 55 && sum < 70){
            return 'P';
        }
        else if(sum >= 40 && sum < 55){
            return 'D';
        }
        else{
            return 'T';
        }

    }


}
