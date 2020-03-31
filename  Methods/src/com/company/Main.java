package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;
        int highScore= calculateScore(true,800,levelCompleted,bonus);
        System.out.println("Your high score is:"+highScore);


        score=10000;
        levelCompleted=8;
        bonus=200;

        highScore= calculateScore(true,800,levelCompleted,bonus);
        System.out.println("Your high score is:"+highScore);
        displayHighScorePosition("Gökhan",745);
      }



    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){

        if(gameOver==true){
            int finalScore=score+(levelCompleted*bonus);
            finalScore+=1000;
           // gameOver=false;
           // System.out.println("Your final score is:"+finalScore);
            return finalScore;
        }
       else return -1;
    }

   /* public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName+" managed to get position: "+ highScorePosition);
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>=1000){
            return 1;
        }
        else if(playerScore>=500 && playerScore<1000){
            return 2;
        }
        else if (playerScore>=100 && playerScore<500)
        {
            return 3;
        }
        else {return 4;}
    }*/

   public static void displayHighScorePosition(String name, int finalScore){
       //this.name = name;
       //this.finalScore = finalScore;
       System.out.println(name+"\tmanaged to get in position: \t"+calculateHighScorePosition(finalScore));
   }
   public static int calculateHighScorePosition(int finalScore){
       if (finalScore>=1000){
           return 1;
       }
       else if(finalScore>500&&finalScore<1000)
       {
           return 2;
       }
       else if(finalScore<=500&&finalScore>100){
           return 3;
       }
       else
           {return 4;}
   }
}
