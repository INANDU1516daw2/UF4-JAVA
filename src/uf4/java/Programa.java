package uf4.java;

import java.util.Scanner;

public class Programa {
    public static void main(String args[]){
        Alumne alumne1;
        alumne1 = new Alumne();
        
        alumne1.setNom ("inge");
        alumne1.setNota (4.9);
        
        System.out.println("Nom: " + alumne1.getNom().toUpperCase()
                + "\nNota " + alumne1.getNota()
        );
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nNom nou: ");
        alumne1.setNom(entrada.nextLine());
        System.out.println("\nNou nom entrat: " + alumne1.getNom());
        
    }
}
