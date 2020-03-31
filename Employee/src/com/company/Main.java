package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee eleman1=new Employee("Dodo",31,"Hava Trafik Kontrolörü",10000d);
        /*eleman1.setAge(31);
        eleman1.setDesignation("Hava Trafik Kontrolörü");
        eleman1.setSalary(10000);
        eleman1.getEmployee();*/
        Employee2 eleman2=new Employee2("Fatma Nur Gültekin",27,"Programcı",5500);
        eleman2.getEmployee2();
        Employee2 eleman3= new Employee2("Keziban",55,"Ev hanımı",0.0d);
        eleman3.getEmployee2();
        System.out.println("İlk eleman maas:\n"+eleman1.getSalary());
    }
}




