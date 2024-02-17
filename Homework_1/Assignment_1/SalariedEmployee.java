package Homework_1.Assignment_1;

public class SalariedEmployee extends Employee{
    int weekly_salary;
    SalariedEmployee(String firstname, String lastname, String SSN, int weekly_salary){
        super(firstname, lastname, SSN);
        this.weekly_salary = weekly_salary;
    }
    SalariedEmployee(){
        super("", "", "");
        weekly_salary = 0;
    }
    public void print(){
        System.out.println(first_name + " " +last_name + " SSN:" + SSN + " Weekly_Salary:" +weekly_salary);
    }
}
