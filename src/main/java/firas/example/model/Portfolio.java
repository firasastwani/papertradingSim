package firas.example.model;

import java.math.BigDecimal;

public class Portfolio {

    private String ticker; 
    private float quantity; 
    private float currentValue; 

    public Portfolio(String ticker, float quantity, float currentValue){

        this.ticker = ticker; 
        this.quantity = quantity; 
        this.currentValue = currentValue; 
    }


    // getters and setters

    public String getTicker(){
        return ticker; 
    }

    public float getQuantity(){

        return quantity;
    }

    public float getCurrentValue(){
        return currentValue;
    }

    public void setTicker(String ticker){
        this.ticker = ticker;
    }

    public void setQuantity(float quantity){
        this.quantity = quantity; 
    }

    public void setCurrentValue(float currentValue){
        this.currentValue = currentValue;
    }



}
