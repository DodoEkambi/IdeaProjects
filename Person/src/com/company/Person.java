package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return  this.firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setAge(int age){
        if(age<0||age>100){
            this.age=0;
        }else
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isTeen(){
        return this.age > 12 && this.age < 20;
    }
    public String getFullName(){
        if(firstName.isEmpty()&&lastName.isEmpty()){
            return " ";
        }
        else if(firstName.isEmpty()){
            return getLastName();
        }
        else if(lastName.isEmpty()){
            return getFirstName();
        }
        else return getFirstName()+" "+getLastName();
    }
}
