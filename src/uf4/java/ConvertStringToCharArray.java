package uf4.java;

import java.util.Scanner;

public class ConvertStringToCharArray {
    
    public static void main(String args[]){
        
        String testString = "This is a test";
        
        char[] charArray = testString.toCharArray();
        
        for(int i=0; i<(charArray.length);i++){
            System.out.println("Array["+i+"]: "+charArray[i]);
        }System.out.println("");
        
        for(int i=0; i<(charArray.length);i++){
            System.out.print(charArray[i]);
        }System.out.println("\n");
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter frase:");
        String frase = scan.nextLine();
        System.out.println("frase: "+frase);
        
        char[] A = frase.toCharArray();
        for(int i=0; i<(A.length);i++){
            System.out.print("A["+i+"]:"+A[i]+", ");
        }
    }
}
