package com.company;

public class Main {
    private static String errMessage="Invalid day";

    public static void main(String[] args) {
        //printDayOfTheWeek(8);
        //printDayOfTheWeek(0);
        System.out.println(getDaysOfMonth(12,2023));
        System.out.println(getDaysOfMonth(13,2012));
        System.out.println(getDaysOfMonth(-1,100));
        System.out.println(getDaysOfMonth(2,2020));
        System.out.println(getDaysOfMonth(2,2021));
	// write your code here
       /* char displayedChar='C';
        switch (displayedChar){
            case 'a':
                System.out.println('a');
                break;
            case 'b':
                System.out.println('b');
            break;
                case 'c':
                    System.out.println('c');
                    break;
            case 'd':
                System.out.println('d');
                break;
            case 'e':
                System.out.println('e');
                break;
            default:
                System.out.println("A,B,C,D,E was not found.");*/}
        /*public static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
                case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }

        }*/
      /* public static void printDayOfTheWeek(int day){
           if(day>=0&&day<7){
               switch (day){
               case 1:
                   System.out.println("Monday");
                   break;
               case 2:
                   System.out.println("Tuesday");
                   break;
               case 3:
                   System.out.println("Wednesday");
                   break;
               case 4:
                   System.out.println("Thursday");
                   break;
               case 5:
                   System.out.println("Friday");
                   break;
               case 6:
                   System.out.println("Saturday");
                   break;
               case 0:
                   System.out.println("Sunday");
                   break;
               default:
                   System.out.println(errMessage);
                   break;}
           }
           else {System.out.println(errMessage);}

        }*/


        public static boolean isLeapYear(int year){

                if ((year >= 1) && (year <= 9999)) {
                    if ((year % 4 == 0)) {
                        if (year % 100 == 0) {
                            if ((year % 400) == 0) {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
                return false;
            }
            public static int getDaysOfMonth(int month,int year){
                if((month>=1&&month<=12)&&(year >= 1) && (year <= 9999)){
                        switch (month){
                            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                                return 31;
                            case 2:
                                if(isLeapYear(year)){
                                    return 29;
                                }
                                else return 28;
                            case 4: case 6: case 9: case 11:
                                return 30;
                            default:
                                return -1;
                        }

                }
                else return -1;
            }


        }


