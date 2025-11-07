package solution1;

public class Student {
    int rollNo;
    String name;
    int age;
    String course;

    Student(int rollNo,String name, int age,String course)
        throws AgeNotwithinRangeException, NameNotValidException {

        if (age<15 || age>21 ){
            throw new AgeNotwithinRangeException("Age should be between 15 and 21");
        }
        if (!name.matches("[A-Za-z ]+")) {
            throw new NameNotValidException("Name sshould contain only alphabets and spaces");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
