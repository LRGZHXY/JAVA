package shiyan5;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[100];
        this.numberOfStudents = 0;
    }

    // Method to add a student to the course
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            increaseArraySize();
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Method to increase the array size
    private void increaseArraySize() {
        String[] newStudents = new String[students.length * 2];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        students = newStudents;
    }

    // Method to drop a student from the course
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                break;
            }
        }
    }

    // Method to clear all students from the course
    public void clear() {
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }

    // Method to get the students in the course
    public String[] getStudents() {
        String[] currentStudents = new String[numberOfStudents];
        System.arraycopy(students, 0, currentStudents, 0, numberOfStudents);
        return currentStudents;
    }

    // Method to get the number of students in the course
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // Method to get the course name
    public String getCourseName() {
        return courseName;
    }

    // Test program
    public static void main(String[] args) {
        Course course = new Course("Data Structures");

        // Adding students
        course.addStudent("Peter Jones");
        course.addStudent("Kim Smith");
        course.addStudent("Anne Kennedy");

        // Display students
        System.out.println("Students in course " + course.getCourseName() + ":");
        for (String student : course.getStudents()) {
            System.out.println(student);
        }

        // Dropping a student
        course.dropStudent("Kim Smith");
        System.out.println("\nAfter dropping Kim Smith:");
        for (String student : course.getStudents()) {
            System.out.println(student);
        }

        // Clearing the course
        course.clear();
        System.out.println("\nAfter clearing the course:");
        for (String student : course.getStudents()) {
            System.out.println(student);
        }
        System.out.println("Number of students: " + course.getNumberOfStudents());
    }
}
