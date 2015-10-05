package uf4.java;
import java.util.Scanner;

public class Ex01 {
    
    public static void main(String args[]){
        
        char character = 'a';
        System.out.println(character + ": " + (int)character); // cast from char to int
        
        int number = 97;
        System.out.println(number + ": " + (char)number); // cast from int to char
        System.out.println((number+1) + ": " + (char)(number + 1));
        System.out.println((number+25) + ": " + (char)(number + 25));
        System.out.println("\n");
        
        System.out.println("ABECEDARI ASCII");
        int count = 0;
        for(int i=97; i<=122;i++){
            count ++;
            System.out.println( i + " = " + (char)i + " = " + (int)((char)i) );
        }
        System.out.println("total lletras: "+(count-1));
        
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()){
        
        }
        System.out.println("Paraula: ");
        String word = scan.nextLine();
        
        System.out.println("lenght:"+word.length());
        int posicio = word.indexOf(".com");
        System.out.println(posicio);
        
        
        int[] Array = new int[word.length()];
        for(int j=0;j<word.length();++j){
            Array[j]=j;
            System.out.println("Array["+j+"]="+Array[j]);
        }
    }
}
