package com.company;


public class Floor {
    private Dimensions floorDimensions;
    private String material;

    public Floor(Dimensions floorDimensions, String material) {
        this.floorDimensions = floorDimensions;
        this.material = material;
    }
    public void setColor(String color){
        System.out.println("Floor color is: "+color);
    }
    public String getMaterial() {
        return material;
    }
}
