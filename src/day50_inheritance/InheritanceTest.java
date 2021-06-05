package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {

            Person p1 = new Person();
            p1.name = "Bakyt";
            p1.age = 30;

            p1.talk();
            p1.walk();
            p1.work("SDET");

            Teacher t1 = new Teacher();
            t1.teacherID = 1234;
            t1.name = "Saim";
            t1.age = 25;
            t1.talk();
            t1.walk();
            t1.teach("java inheritance");

            Student s1= new Student();

            s1.studentID=2345;
            s1.name = "Fuxuan";
            s1.age = 32;
            s1.school="Cybertek";
            s1.learn("Java");



        }

    }

