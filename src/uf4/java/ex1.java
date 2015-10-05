package uf4.java;

import java.util.Scanner;

public class ex1 {
    
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        //1. Programa una classe que determini el nombre d'aparicions d'una paraula en una altra.
        System.out.println("\nfrase: ");
        String paraulaOnCercar = entrada.nextLine();
        
        System.out.println("\nparaula buscada: ");
        String paraulaACercar = entrada.nextLine();
        
        if(paraulaACercar.contains(paraulaOnCercar)){
            System.out.println("conte la paraula");
        }else{
            System.out.println("no la conte");
        }
        //2. Implementa una classe que presenti el nombre d'aparicions de cadascuna de les lletres d'una
        //   paraula donada per l'entrada estàndard.
        System.out.println("\nfrase: ");
        String paraula2 = entrada.nextLine();
        
        int numAparicions = 0;
        int posicio = 0;
        
        //indexOf torna -1 si no troba la paraula a la cadena
        //per cada paraula trobada, augmenta en 1 la posicio
        while((posicio=paraulaOnCercar.indexOf(paraulaACercar, posicio)) !=-1){
            posicio++;
            numAparicions++;
        }
        
    }        
}
   

