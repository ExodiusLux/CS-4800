package Assignment_1;

public class HourlyEmployee extends Employee{
    int wage; 
    int hoursWorked;
    HourlyEmployee(String firstname, String lastname, String SSN, int wage, int hoursWorked){
        super(firstname, lastname, SSN);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }
    HourlyEmployee(){
        super("", "", "");
        wage = 0;
        hoursWorked = 0;
    }
}
