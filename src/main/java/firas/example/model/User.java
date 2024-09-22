package firas.example.model;

import java.math.BigDecimal; 

public class User {

    private BigDecimal balance; 
    private BigDecimal totalAccountValue; 

    public User(BigDecimal startingBalance){
        this.balance = startingBalance; 
        this.totalAccountValue = startingBalance; 
    }

    // getters and setters

    public BigDecimal getBalance(){
        return balance; 
    }

    public void setBalance(BigDecimal balance){
        this.balance = balance; 
    }

    public BigDecimal getTotalAccountValue(){
        return totalAccountValue;
    }

    public void setTotalAccountValue(BigDecimal totalAccountValue){
        this.totalAccountValue = totalAccountValue; 
    }



}
