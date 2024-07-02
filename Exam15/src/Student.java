public class Student {
    String number;
    String name;
    float score;

    // Constructor
    Student(String number1, String name1, float score1) {
        number = number1;
        name = name1;
        score = score1;
    }

    // Used to print student details in main()
    public String toString() {
        return this.number + " " + this.name + " " + this.score;
    }
}
