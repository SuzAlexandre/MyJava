package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        Date now = new Date();
//        String message = "Hello\t you"+"!!\n"+"this is :\\" +now;
//        System.out.println(message);
//        System.out.println(message.replace("!!","?"));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number:");
//
//        int num = scanner.nextInt();
//
//        if (num%5==0)
//            System.out.println("Fizz");
//        if (num%3==0)
//            System.out.println("Buzz");
//        if ((num%5!=0)&&(num%3!=0))
//            System.out.println(num);

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

        // Setup main frame
        JFrame frame = new JFrame("Production interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocation(50,50);

        // Adding menu bar
        JMenuBar menuBar = new JMenuBar();

        // Declare menus
        JMenu menuMain = new JMenu("Main");
        JMenu menuOption = new JMenu("Options");
        JMenu menuHelp = new JMenu("Help");

        // Declare menu items
        JMenuItem menuItemExit = new JMenuItem("Exit");
        JMenuItem menuItemDBConnect = new JMenuItem("Database connection");
        JMenuItem menuItemLanguage = new JMenuItem("Language");
        JMenuItem menuItemAbout = new JMenuItem("About");

        // Adding menu items
        menuMain.add(menuItemExit);
        menuOption.add(menuItemDBConnect);
        menuOption.add(menuItemLanguage);
        menuHelp.add(menuItemAbout);

        // Adding menus
        menuBar.add(menuMain);
        menuBar.add(menuOption);
        menuBar.add(menuHelp);

        //Adding menu bar in frame
        frame.setJMenuBar(menuBar);

        // Declare tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Setting layout policy
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        JPanel tabPane01 = new JPanel();
        JPanel tabPane02 = new JPanel();
        JPanel tabPane03 = new JPanel();
        JPanel tabPane04 = new JPanel();
        JPanel tabPane05 = new JPanel();

        tabbedPane.add("Quality check",tabPane01);
        tabbedPane.add("Packing station",tabPane02);
        tabbedPane.add("Add scrap",tabPane03);
        tabbedPane.add("Downtime event",tabPane04);
        tabbedPane.add("Cutting tools change",tabPane05);

        // Setting up items in quality checks tab
        JLabel barcodeLabel = new JLabel("Barcode");
        tabPane01.add(barcodeLabel);
        JTextField barcodeInput = new JTextField(10);
        tabPane01.add(barcodeInput);
        JButton myButt = new JButton("Press me");
        tabPane01.add(myButt);

        frame.add(tabbedPane, BorderLayout.CENTER);

//        frame.getContentPane().add(myButt);
        frame.setVisible(true);

    }
}
