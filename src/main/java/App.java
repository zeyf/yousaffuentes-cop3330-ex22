// yousaffuentes-cop3330-ex22

/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = s.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = s.nextInt();

        int largestNumber = 0;

        if (num1 != num2 && num2 != num3 && num1 != num3) {

            if (num1 > num2 && num1 > num3)
                largestNumber = num1;
            else if (num2 > num1 && num2 > num3)
                largestNumber = num2;
            else if (num3 > num1 && num3 > num2)
                largestNumber = num3;

            System.out.println(String.format("The largest number is %d.", largestNumber));

        };

    }
}

