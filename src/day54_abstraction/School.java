package day54_abstraction;

public class School {
    public static void main(String[] args) {

        // Student student = new Student(); error - cannot create object of student
        OnlineStudents onlineStudent = new OnlineStudents ();

        onlineStudent.attendClass();
    }
}
