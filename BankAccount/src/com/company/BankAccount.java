package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setBalance(double balance){
        if (balance>0){
            this.balance=balance;
        }
        else
            this.balance=balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void depositFunds(double funds){
        this.balance+=funds;
        System.out.println(funds+" deposited to the account.");
    }
    public void withdrawFunds(double funds){
        if(funds>balance){
            System.out.println("Your request denied due to lack of money!!!");
        }else if(balance<0){
            System.out.println("Insufficient cash.Your balance is : "+ balance);
        }
        else{
            this.balance-=funds;
        System.out.println("Your withdrawal is "+funds+" your amount: "+balance);}

    }
}
