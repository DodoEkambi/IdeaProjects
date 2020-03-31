package com.company;

public class Car extends Vehicle {
    private String model;
    private String typeOfGas;
    private String typeOfGear;
    public Car(int wheel, String type, String model, String typeOfGas, String typeOfGear, boolean moving) {
        super(wheel, type, moving);
        this.model = model;
        this.typeOfGas = typeOfGas;
        this.typeOfGear = typeOfGear;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOfGas() {
        return typeOfGas;
    }

    public void setTypeOfGas(String typeOfGas) {
        this.typeOfGas = typeOfGas;
    }

    public String getTypeOfGear() {
        return typeOfGear;
    }

    public void setTypeOfGear(String typeOfGear) {
        this.typeOfGear = typeOfGear;
    }



}
