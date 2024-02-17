package Homework_1.Assignment_1;

public class Employee {
    String first_name;
    String last_name;
    String SSN;
    Employee(String first_name, String last_name, String SSN){
        this.first_name = first_name;
        this.last_name = last_name;
        this.SSN = SSN;
    }
    Employee(){
        first_name = "";
        last_name = "";
        SSN = "";
    }
}
