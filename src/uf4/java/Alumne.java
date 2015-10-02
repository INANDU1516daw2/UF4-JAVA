package uf4.java;

public class Alumne {
    //atributs
    private String nom;
    private double nota;
    //constructor (el posa el compilador)
    //...
    
    //Metodes accesors per a poder les variables privadas fora de la classe.
    public void setNom(String n){
        //objecte - argument
        this.nom = n;
    }
    public String getNom(){
        return nom;
    }
    public void setNota(double x){
        //objecte - argument
        this.nota = x;
    }
    public double getNota(){
        return nota;
    }
}
