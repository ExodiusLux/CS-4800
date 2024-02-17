package Homework_1.Assignment_3;

public class Course {
    private String course_name; 
    private Instructor instructor;
    private Textbook textbook;

    Course(String course_name, Instructor instructor, Textbook textbook){
        this.course_name = course_name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void printInfo() {
        System.out.println("Course Name: " + course_name);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Office Number: " + instructor.getOfficeNumber());
        System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
    }
}
