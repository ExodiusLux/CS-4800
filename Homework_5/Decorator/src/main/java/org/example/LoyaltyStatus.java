package org.example;

public class LoyaltyStatus {
    private boolean status;
    public LoyaltyStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }

    public void setMember(boolean status){
        this.status = status;
    }
}
