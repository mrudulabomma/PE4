package com.stackroute.pe4;

import java.util.List;
/*finds transpose of string*/
public class Transposer {
    public String transposeOfString(String input) {
        String str = input.toLowerCase();
        String words[] = str.split("\\s");//splits based on space
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();//performs reverse operation on words
            reverseWord += sb.toString() + " ";
        }
        return reverseWord.trim();
    }

    }
