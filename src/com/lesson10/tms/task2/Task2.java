package com.lesson10.tms.task2;

import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader filegr = new BufferedReader(new FileReader("C:\\Users\\Мария\\Desktop\\TMS\\Lesson10\\file\\gr.txt"));
        BufferedReader filekl = new BufferedReader(new FileReader("C:\\Users\\Мария\\Desktop\\TMS\\Lesson10\\file\\kl.txt"));
        BufferedReader filety = new BufferedReader(new FileReader("C:\\Users\\Мария\\Desktop\\TMS\\Lesson10\\file\\ty.txt"));
        String str;
        String str2;
        String str3;
        ArrayList<String> file = new ArrayList<String>();
        while ((str = filegr.readLine()) != null) {
            if (!str.isEmpty()) {
                file.add(str);
                System.out.println(str);
            }
        }
        while ((str2 = filekl.readLine()) != null) {
            if (!str2.isEmpty()) {
                file.add(str2);
                System.out.println(str2);
            }
        }
        while ((str3 = filety.readLine()) != null) {
            if (!str3.isEmpty()) {
                file.add(str3);
                System.out.println(str3);
            }
        }
        System.out.println(file);
        System.out.println(file.size());

        HashSet<String> hashSet = new HashSet<>();
        for (String s : file) {
            {
                hashSet.add(s);
            }
        }

        System.out.println(hashSet);
        System.out.println(hashSet.size());

        HashMap<String,String> hashmap= new HashMap<String,String>();
        for (String s : hashSet) {
            if (s.startsWith("docnum") || s.startsWith("kontract") && s.length() == 15) {
                hashmap.put("Valid",s);
            } else if (!s.startsWith("docnum")) {
                hashmap.put("NotValid",s);
            } else if (!s.startsWith("kontract")) {
                hashmap.put("NotValid",s);
            } else if (s.length() != 15) {
                hashmap.put("NotValid",s);
            }
        }
        System.out.println(hashmap);

        FileWriter fileWriterValid = new FileWriter("fileValid.txt");
        BufferedWriter writerValid = new BufferedWriter(fileWriterValid);

        writerValid.write(String.valueOf(hashmap));
        writerValid.close();
    }
}
