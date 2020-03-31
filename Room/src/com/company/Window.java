package com.company;

public class Window {
    private Dimensions dimensions;
    private String material;
    private double height;

    public Window(Dimensions dimensions, String material, double height) {
        this.dimensions = dimensions;
        this.material = material;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public double getHeight() {
        return height;
    }

    public void openWindow(){
        System.out.println("Window has been opened.");
    }

}
