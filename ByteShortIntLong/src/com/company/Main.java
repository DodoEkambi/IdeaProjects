package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue=10000;
        int myMinIntValue=Integer.MIN_VALUE;
        int myMaxIntValue=Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " +myMinIntValue);
        System.out.println("Integer Max Value = " +myMaxIntValue);


        byte myMinByteValue= Byte.MIN_VALUE;
        byte myMaxByteValue= Byte.MAX_VALUE;
        System.out.println("My min byte value = " + myMinByteValue);
        System.out.println("My max byte value = " + myMaxByteValue);

        short myMinShortValue= Short.MIN_VALUE;
        short myMaxShortValue= Short.MAX_VALUE;
        System.out.println("My min short value = " + myMinShortValue);
        System.out.println("My max short value = " + myMaxShortValue);

        long myLongValue= 100L;
        long myMinLongValue= Long.MIN_VALUE;
        long myMaxLongValue= Long.MAX_VALUE;
        System.out.println("My min long value = " + myMinLongValue);
        System.out.println("My max long value = " + myMaxLongValue);
        System.out.println("My long Value= "+ myLongValue);


        int myTotal=(myMinIntValue/2);
        byte myNewByteValue= (byte) (myMinByteValue/2);
        short myNewShortValue= (short) (myMinShortValue/2);


        byte myFirstByte=10;
        short mySecondShort=11;
        int myThirdInt=12;
        long myForthLong= 50_000 + 10 * myFirstByte + mySecondShort + myThirdInt;
        System.out.println("My Long Number= "+myForthLong);




    }
}
