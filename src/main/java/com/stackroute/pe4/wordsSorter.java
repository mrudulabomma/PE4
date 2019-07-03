package com.stackroute.pe4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*class used to sort words*/

public class wordsSorter {
    public List<String> sortedWordsList(String input){
        String str=input.toLowerCase();//converts to lowercase
        List<String> list= Arrays.asList(str.split(" "));
        Collections.sort(list);//sorts the given list
        System.out.println(list);
        return list;
    }
}
