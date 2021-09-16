package com.lesson10.tms.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Task6 {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("Mark","Ester",13,7.9));
        list.add(new Student("Victor","Tovtiko",15,5.3));
        list.add(new Student("Elena","Krachkovskaya",16,8.9));
        list.add(new Student("Victoriya","Ovsyanik",17,7.9));

        Student max=list.get(0);
        Student min=list.get(0);

        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(max.middleMark);
        }
       // Comparator<Student> compareLastName = new Comparator<Student>() {

//            @Override
//            public int compare(Student o1, Student o2) {
//                int i = o1.lastname - o2.lastname;
//                return i;
//            }
//            Collections.sort(Student,compareLastName);

//            @Override
//            public Comparator<Student> reversed() {
//                return Comparator.super.reversed();
//            }
//
//            @Override
//            public Comparator<Student> thenComparing(Comparator<? super Student> other) {
//                return Comparator.super.thenComparing(other);
//            }

        };
    }
//}
