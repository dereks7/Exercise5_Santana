import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
public class ex5_santana
{
    public static void main( String[] args )
    {
        System.out.println( "What is the first number?" );
        Scanner in1 = new Scanner(System.in);
        String num1 = in1.nextLine();
        int n1 = Integer.parseInt(num1);
        System.out.println( "What is the second number?" );
        Scanner in2 = new Scanner(System.in);
        String num2 = in2.nextLine();
        int n2 = Integer.parseInt(num2);
        System.out.println( num1+ "+" + num2 + "=" + (n1 + n2));
        System.out.println( num1+ "-" + num2 + "=" + (n1 - n2));
        System.out.println( num1+ "*" + num2 + "=" + (n1 * n2));
        System.out.println( num1+ "/" + num2 + "=" + (n1 / n2));
    }
}
