package com.company;

public class Model extends Car {
    private int maxSpeed;
    private int numberOfGear;
    private int currentSpeed;
    private int currentGear;
    private int velocity;

    public Model(int wheel, String model, String typeOfGas, String typeOfGear,  int maxSpeed, int numberOfGear, int currentSpeed, int currentGear, int velocity) {
        super(wheel, "car", model, typeOfGas, typeOfGear, true);
        this.maxSpeed = maxSpeed;
        this.numberOfGear = numberOfGear;
        this.currentSpeed = currentSpeed;
        this.currentGear = currentGear;
        this.velocity = velocity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfGear() {
        return numberOfGear;
    }

    public void setNumberOfGear(int numberOfGear) {
        this.numberOfGear = numberOfGear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public void setMoving(boolean moving) {
        super.setMoving(moving);
        if (isMoving()) {
            if (velocity > 0) {
                setCurrentSpeed(getVelocity());
                int gear = getCurrentGear();
                gear++;
                setCurrentGear(gear);
            }
            }
        else {
            setCurrentSpeed(0);
            setCurrentGear(0);
            setVelocity(0);
        }
    }

    public void getCurrentState(){
        if(isMoving()){
            System.out.println("Your car has started. Its current state "+isMoving()+" and it is @ "+ getCurrentSpeed()+" km/h also it is current gear is "+ getCurrentGear()+".  It accelerates by " +getVelocity());
        }
        else {
            System.out.println("Your car "+isMoving()+" it has "+getCurrentSpeed()+" km/h and it is gear is "+ getCurrentGear()+" it is current velocity " + getVelocity());
        }
    }
}
