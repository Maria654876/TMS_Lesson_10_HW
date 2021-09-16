package com.lesson10.tms.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String one, two, tree, four, five;
        Scanner console=new Scanner(System.in);
        System.out.println("Введите первую строку ");
        one=console.nextLine();
        System.out.println("Введите вторую строку ");
        two=console.nextLine();
        System.out.println("Введите третью строку ");
        tree = console.nextLine();
        System.out.println("Введите четвертую строку ");
        four=console.nextLine();
        System.out.println("Введите пятую строку ");
        five=console.nextLine();
        ArrayList<String> myArray=new ArrayList<>(5);
        myArray.add(one);
        myArray.add(two);
        myArray.add(tree);
        myArray.add(four);
        myArray.add(five);
        System.out.println(myArray);

        StringBuilder lp = new StringBuilder();
        for (String s : myArray)
        {
            lp.append(s);
            lp.append("\t");
            s.replace("+++","+");
            System.out.println(s);
        }
        System.out.println(myArray);
    }
}
