package Assignment_1;

public class ComissionEmployee extends Employee{
    int comissionRate;
    int grossSales;
    ComissionEmployee(String firstname, String lastname, String SSN, int comissionRate, int grossSales){
        super(firstname, lastname, SSN);
        this.comissionRate = comissionRate;
        this.grossSales = grossSales;
    }
    ComissionEmployee(){
        super("", "", "");
        comissionRate = 0;
        grossSales = 0;
    }
}
