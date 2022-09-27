package com.FoodItems;

public class FoodItems {
    Integer Coffee;
    Integer Tea;
    Integer Idly;
    Integer Dosa;

    //Constructor
    public FoodItems(Integer coffee, Integer tea, Integer idly, Integer dosa) {
        Coffee = coffee;
        Tea = tea;
        Idly = idly;
        Dosa = dosa;
    }

    //Getters and Setters
    public Integer getCoffee() {
        return Coffee;
    }

    public void setCoffee(Integer coffee) {
        Coffee = coffee;
    }

    public Integer getTea() {
        return Tea;
    }

    public void setTea(Integer tea) {
        Tea = tea;
    }

    public Integer getIdly() {
        return Idly;
    }

    public void setIdly(Integer idly) {
        Idly = idly;
    }

    public Integer getDosa() {
        return Dosa;
    }

    public void setDosa(Integer dosa) {
        Dosa = dosa;
    }
}
