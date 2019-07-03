package com.stackroute.pe4;

import java.util.HashMap;

public class OcurrenceOfCharacter {
    int count=0;
    public int characterCount(char c,String inputString)
    {

        String inputstr=inputString.toLowerCase();

        //Converting given string to char array

        char[] strArray = inputstr.toCharArray();

        //checking occurrence of character
for(int i=0;i<strArray.length;i++)
{
            if(strArray[i]==c)
            {
                //If char is present in string incrementing it's count by 1

               count+=1;
            }

        }

        //returning count

       return count;
    }

}
