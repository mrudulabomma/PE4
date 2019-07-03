package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*class used to print multiple occurence of given string*/
public class MultipleOccurenceChecker {
    String str="";
    public String check(String pat, String input) {

String inputString=input.toLowerCase();
        Pattern pattern = Pattern.compile(pat);//pattern checking
        Matcher matcher = pattern.matcher(inputString);//matches with pattern

        int count = 0;
        while(matcher.find()) {
            count++;
            str=str+"found: "
                    + matcher.start() + " - " + matcher.end();

        }

        return str;

    }
}
