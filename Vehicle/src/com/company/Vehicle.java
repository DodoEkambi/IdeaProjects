package com.company;

public class Vehicle {
   private int wheel;
   private String type;
   private boolean moving;

    public Vehicle(int wheel, String type, boolean moving) {
        this.wheel = wheel;
        this.type = type;
        this.moving = moving;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public boolean isMoving() {
        return moving;
    }
}
