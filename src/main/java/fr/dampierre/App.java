package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
         Scanner clavier = new Scanner(System.in);  
         System.out.println("Saisir un prmier nom commun:"); 
         String Nom= clavier.nextLine();
         System.out.println("Saisir un nombre:"); 
         String Nombre= clavier.nextLine();
         System.out.println("Saisir un deuxième nom commun:"); 
         String nom2 = clavier.nextLine();
         System.out.println("Saisir un adjectif:"); 
         String Adjectif= clavier.nextLine();
         System.out.println("il était une fois un" + Nom + "qui avait" + Nombre +" "+ nom2 + ". Cela le rendait très"+ Adjectif);
    }
    
}
