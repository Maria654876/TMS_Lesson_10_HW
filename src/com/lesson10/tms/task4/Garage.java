package com.lesson10.tms.task4;

import com.lesson10.tms.task4.car.CarOne;
import com.lesson10.tms.task4.car.CarTree;
import com.lesson10.tms.task4.car.CarTwo;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    public static void main(String[] args) {
        HashMap <String,String> hashmap= new HashMap<String,String>();
        hashmap.put( String.valueOf(new CarOne("Audi","573064","2020","red","USA")),"345");
        hashmap.put(String.valueOf(new CarOne("Audi","2083","2020","black","USA")),"65");
        hashmap.put(String.valueOf(new CarTwo("BMW","09345","2019","White","sndhzf478")),"556");
        hashmap.put(String.valueOf(new CarTwo("BMW","954876","2019","Black","x djkftyt8745")),"31");
        hashmap.put(String.valueOf(new CarTree("Toyota","Camry","2020","Yellow")),"87");
        hashmap.put(String.valueOf(new CarTree("Mitsubishi","40598","2021","Blue")),"99");
        System.out.println(hashmap);
        for (Map.Entry<String,String> item: hashmap.entrySet() ){
            System.out.println(item.getKey() + "=" + item.getValue());
        }
        System.out.println(parking());
        System.out.println(exit());
    }

    private static boolean parking() {
        System.out.println("Automatic parking");
        return true;
    }

    private static boolean exit(){
        System.out.println("The car can leave");
        return false;
    }
}
