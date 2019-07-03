package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpreesionChecker {
    public boolean harryPresence(String input){
        String inputString=input.toLowerCase();//converting to lowercase
        String pattern="(.*)harry(.*)";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(inputString);//matches with the pattern
        if(m.matches()){
            return true;
        }
        else
        {
            return false;
        }
    }
}
