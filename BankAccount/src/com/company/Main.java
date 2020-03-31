package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountNumber(1);
        bankAccount.setCustomerName("Gökhan Gültekin");
        bankAccount.setBalance(10000);
        bankAccount.setEmail("gkhngul2@gmail.com");
        bankAccount.setPhoneNumber(1111);
        bankAccount.depositFunds(2000);
        bankAccount.withdrawFunds(13000);
        bankAccount.withdrawFunds(12000);
        bankAccount.withdrawFunds(1000);*/
        VipCustomer vipCustomer=new VipCustomer();
        VipCustomer vipCustomer2=new VipCustomer("Dodo2","dodo2@gmail.com");
        VipCustomer vipCustomer3=new VipCustomer("Dodo3",987654,"dodo3@gmail.com");
        System.out.println("Vip Customer 1 "+vipCustomer.getName());
        System.out.println("Vip Customer "+vipCustomer2.getName()+ " email: " +vipCustomer2.getEmail());
        System.out.println("Vip Customer 3 credit limit: " + vipCustomer3.getCreditLimit());

    }
}
