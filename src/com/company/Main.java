package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
//
//        Date now = new Date();
//        String message = "Hello\t you"+"!!\n"+"this is :\\" +now;
//        System.out.println(message);
//        System.out.println(message.replace("!!","?"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = scanner.nextInt();


        if (num%5==0)
            System.out.println("Fizz");
        if (num%3==0)
            System.out.println("Buzz");
        if ((num%5!=0)&&(num%3!=0))
            System.out.println(num);



//        final float PI = 3.14F;
//        int[][]numbers = {{1,2,3,4},{5,6,7}};
//        System.out.println(Arrays.deepToString(numbers));
//        String x="1";
//        int y = Integer.parseInt(x) +2;
//        double result = Math.random();
//        System.out.println(y);
//        System.out.println(Math.floor(PI));
//        System.out.println(result);
//
//        JFrame frame = new JFrame("My frame");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300,300);
//        JButton myButt = new JButton("Press me");
//        frame.getContentPane().add(myButt);
//        frame.setVisible(true);







    }
}
