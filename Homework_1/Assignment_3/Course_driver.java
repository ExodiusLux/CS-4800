package Homework_1.Assignment_3;

public class Course_driver {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("Justin", "Royce", "4-1234");

        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Design Patterns Elements of Reusable Object-Oriented Software", "Erich Gamma", "Addison Weekly");

        Course course1 = new Course("Software Engineering", instructor1, textbook1);
        Course course2 = new Course("Object Oriented", instructor2, textbook2);

        System.out.println("Course 1 Information:");
        course1.printInfo();
        System.out.println();

        System.out.println("Course 2 Information:");
        course2.printInfo();
    }
}
