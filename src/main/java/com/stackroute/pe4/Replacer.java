package com.stackroute.pe4;

public class Replacer {
    public String replaceLetters(String input){
        String str=input.toLowerCase();//convertsto lowercase
        String result=str.replace('d','f');//replaces old character with new one.
        String output=result.replace('l','t');
        return output;
    }

}
