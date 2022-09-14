package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return number*2;
    }

    private static int add(int[] number) {
        var sum = 0;
        for (int each_number : number ){
            sum +=each_number;
        }
        return sum;
    }

}
