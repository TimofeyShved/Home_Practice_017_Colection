package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        int max = 1000000;

        arrayList = FullList(arrayList, max);
        linkedList = FullList(linkedList, max);


        long startTime = System.currentTimeMillis();
        RandomGetList(linkedList, 100000);
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        RandomGetList(arrayList, 100000);
        System.out.println(System.currentTimeMillis() - startTime);
    }


    public static <T extends List> T FullList(T t, int max){
        for (int i = 0; i < max; i++){
            t.add((int)(Math.random()*max));
        }
        return t;
    }

    public static <T extends List> void RandomGetList(T t, int max){
        for (int i = 0; i < max; i++){
            t.get((int)(Math.random()*max));
        }
    }
}
