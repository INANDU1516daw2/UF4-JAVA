package uf4.java;

import java.util.Scanner;

public class ReverseCharArray {
    
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String frase = scan.nextLine();
        char[] A = new char[frase.length()];
        
        for (int i=(frase.length() - 1), j = 0;   i != -1;   i--, j++) {
            A[j] = frase.charAt(i);
        }
        String fraseInvert = new String(A);
        ReverseCharArray fraseRevertida = new ReverseCharArray();
        System.out.println("Name reverted: "+fraseInvert);
    }
}
