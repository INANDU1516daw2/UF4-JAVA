package uf4.java;

import java.util.Scanner;

public class ConvertCharArrayToString {
    
    public static void main(String args[]){
        
        char[] charArray = new char[] {'I','n','g','e'};
        
        String myString1 = String.valueOf(charArray);
        String myString2 = new String(charArray);
        
        System.out.println("myString1: " + myString1 + "\nmyString2: " + myString2);
    }
    
}
