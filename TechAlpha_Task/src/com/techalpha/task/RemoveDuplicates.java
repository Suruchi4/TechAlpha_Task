package com.techalpha.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
//        Original array
        int [] array = {1,2,2,3,3,4,5};

//        convert array to ArrayList
        List<Integer> list = new ArrayList<>();
        for (int value : array){
            list.add(value);
        }

//      pass ArrayList to HashSet to remove duplicates

        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        
//      array after removing duplicates
        System.out.println(list);
    }
}
