package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions=new Dimensions(240,200);
        Floor floor=new Floor(dimensions,"wooden");
        Window window=new Window(dimensions,"plastic",50);
        Room theRoom=new Room(dimensions,floor,window,240);
        theRoom.getRoom();
    }
}
