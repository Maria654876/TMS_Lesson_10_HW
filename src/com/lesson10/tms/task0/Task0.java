package com.lesson10.tms.task0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Task0 {
    public static void main(String[] args) {
        Random random=new Random();
        ArrayList<Integer> myArray=new ArrayList<>(10);
        for (int i=0; i<10; i++){
            myArray.add((int) (2+Math.random()*90));
        }
        System.out.println(myArray);
        System.out.println("Min "+ Collections.min(myArray));
        System.out.println("Max "+Collections.max(myArray));
    }
}
