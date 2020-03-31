package com.company;

public class Room {
    private Dimensions dimensions;
    private Floor floor;
    private Window window;
    private double height;

    public Room(Dimensions dimensions, Floor floor, Window window, double height) {
        this.dimensions = dimensions;
        this.floor = floor;
        this.window = window;
        this.height = height;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Floor getFloor() {
        return floor;
    }

    public Window getWindow() {
        return window;
    }

    public double getHeight() {
        return height;
    }

    public void getRoom(){
        System.out.println("The room dimensions are:"+dimensions.getLength()+" and "+dimensions.getWidth()+" also has a length "+getHeight()+" . The floor is made up from "+floor.getMaterial()+ "The window specifications are: "+ window.getMaterial());
        window.openWindow();
        window.
    }

}
