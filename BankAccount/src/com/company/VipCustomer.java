package com.company;

public class VipCustomer {
    private String name;
    private long creditLimit;
    private String email;
    public VipCustomer() {
        this("Dodo",1234567,"dodo@email.com");
        System.out.println("Empty constructor called.");
    }

    public VipCustomer(String name, String email) {
        this(name,1234567,email);
        System.out.println("Parameters added.");
    }

    public VipCustomer(String name, long creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("3rd constructor has been called.");
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
