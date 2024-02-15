package Assignment_1;

public class BaseEmployee extends Employee{
    int baseSalary;
    BaseEmployee(String firstname, String lastname, String SSN, int baseSalary){
        super(firstname, lastname, SSN);
        this.baseSalary = baseSalary;
    }
    BaseEmployee(){
        super("", "", "");
        baseSalary = 0;
    }
}
