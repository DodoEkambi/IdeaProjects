package com.company;

public class Employee {

        String name;
        int age;
        String designation;
        double salary;
        public Employee(String name,int age,String designation,double salary){
            this.name=name;
            this.age=age;
            this.designation=designation;
            this.salary=salary;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void setAge(int age){
            this.age=age;
        }
        public int getAge(){
            return age;
        }
        public void setDesignation(String designation){
            this.designation=designation;
        }
        public String getDesignation(){
            return designation;
        }
        public void setSalary(double salary){
            this.salary=salary;
        }
        public double getSalary(){
            return salary;
        }
        public void getEmployee(){
            System.out.println("Name:"+name+"\nAge:"+getAge()+"\nDesignation:"+getDesignation()+"\nSalary:"+getSalary()+"\n\n\n");
        }
}
