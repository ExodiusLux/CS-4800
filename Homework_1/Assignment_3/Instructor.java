package Homework_1.Assignment_3;

public class Instructor {
    private String first_name;
    private String last_name;
    private String office_number;

    Instructor(String first_name, String last_name, String office_number){
        this.first_name = first_name;
        this.last_name = last_name;
        this.office_number = office_number;
    }
    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getOfficeNumber() {
        return office_number;
    }

    public void setOfficeNumber(String office_number) {
        this.office_number = office_number;
    }
}
