package com.company;

public class Main {

    public static void main(String[] args) {
    boolean gameOver=true;
    int score=5000;
    int levelCompleted=5;
    int bonus=100;
//    if(score<5000 && score>1000){
//        System.out.println("Your score was less than 5000 but greater than 1000");
//    }
//    else if(score<1000) {
//            System.out.println("Your score was less than 1000");
//        }
//    else {
//        System.out.println("Got here.");
//    }
        if(gameOver==true){
            int finalScore=score+levelCompleted+bonus;
            System.out.println("Your final score is:"+finalScore);
        }


        int lastScore=-20;
        if(lastScore>100){
            System.out.println("Your score is greater than 100");
        }
        else if(lastScore<=100&&lastScore>0){
            System.out.println("Score is between 0 and 100");
        }
        else {
            System.out.println("your grade is smaller than 0");
        }
    }
}
