package Homework_1.Assignment_1;
public class Inherit_driver {
    public static void main(String[] args){
        SalariedEmployee Joe_Jones = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee Stephine_Smith = new HourlyEmployee("Stephine", "Smith", "222-22-2222", 25,32 );
        HourlyEmployee Mary_Quinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19,47 );
        ComissionEmployee Niccole_Dior = new ComissionEmployee("Niccole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee Renwa_Chanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);  
        BaseEmployee Mike_Davenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        ComissionEmployee Mahnaz_Vaziri = new ComissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        Joe_Jones.print();
        Stephine_Smith.print();
        Mary_Quinn.print();
        Niccole_Dior.print();
        Renwa_Chanel.print();
        Mike_Davenport.print();
        Mahnaz_Vaziri.print();
    }
}
